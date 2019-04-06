package test04;

public class ClassifElseDemo {
    public static void main(String[]arg){
        int testscore = 76;
        char grade;

        if (testscore>= 90) {
            grade = 'A';
        } else if (testscore>= 80) {
            grade = 'B';
        } else if (testscore>= 70) {
            grade = 'C';
        } else if (testscore>= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);

    }
}



