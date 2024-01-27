package some_operations;

public class SomeOperations {
    public static void main(String[] args) {
        int number = 0;
        System.out.println(number > 2 & number++ < 1);//false -> bu halda hər iki tərəf yoxlanılır.
        System.out.println(number);//1


        int number1 = 0;
        System.out.println(number1 > 2 && number1++ < 1);//false -> bu halda sol tərəfdə şərt ödənilmirsə, artıq sağ tərəf yoxlanılmır.
        System.out.println(number1);//0


        int number2 = 0;
        System.out.println(number2 > 2 | number2++ < 1);//true -> bu halda hər hansı tərəflərdən birində şərt ödənilirsə, true
        System.out.println(number2);//1

        int number3 = 0;
        System.out.println(number3 < 2 || number3++ < 1);//true -> bu halda sol tərəfdə şərt ödənilirsə, artıq sağ tərəf yoxlanılmır.
        System.out.println(number3);//0
    }
}
