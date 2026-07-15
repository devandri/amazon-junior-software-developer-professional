public class Condition {
    public static void main(String[] args) {
        int marks1 = 80;
        int marks2 = 80;
        int marks3 = 80;

        int average = (marks1 + marks2 + marks3) / 3;
        
        if (average < 1 || average > 100) {
            System.out.println("Out of range");
        } else {
            if (average < 60) {
                System.out.println("Failing");
            } else if (average < 70) {
                System.out.println("Below Average");
            } else if (average < 80) {
                System.out.println("Average");
            } else if (average < 90) {
                System.out.println("Good");
            } else {
                System.out.println("Excellent");
            }
        }

    }
}
