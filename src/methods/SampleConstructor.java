package methods;

import java.util.Stack;

public class SampleConstructor {
    String name;
    int age;

    void incValue(int b) {
        b++;
    }

    void incValue(SampleConstructor sample) {
        sample.age++;
    }

    public SampleConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor called!");
    }

    public static void main(String[] args) {

//        SampleConstructor sample = new SampleConstructor("Aysun", 4);

////        sample.incValue(sample.age);
//        sample.incValue(sample);
//        System.out.println(sample.age);
//
//        String name = "Faxri";
//        name = name.concat(" Nuruyev");
//        System.out.println(name);


        Stack<Integer> stack = new Stack<>();
        Stack<Character> st = new Stack<>();

        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        st.push('H');
        st.push('e');
        st.push('l');
        st.push('l');
        st.push('o');

        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }


}
