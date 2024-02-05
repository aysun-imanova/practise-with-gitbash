package methods.challenges;

public class Challenge1 {
    public static String checkExamMark(int studentScore) {
        if (studentScore > 100) return "Invalid input!";

        if (studentScore > 90 && studentScore <= 100) {
            return "A";
        } else if (studentScore > 80 && studentScore <= 90) {
            return "B";
        } else if (studentScore > 70 && studentScore <= 80) {
            return "C";
        } else if (studentScore > 60 && studentScore <= 70) {
            return "D";
        } else if (studentScore > 50 && studentScore <= 60){
            return "E";
        }
            return "Failed!";
    }
}
