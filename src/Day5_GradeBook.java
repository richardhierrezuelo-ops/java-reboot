//Grade book
//Complete the function so that it finds the average of the three scores passed to it and returns the letter value associated with that grade.
//
//Numerical Score	Letter Grade
//90 <= score <= 100 'A'
//80 <= score < 90	'B'
//70 <= score < 80	'C'
//60 <= score < 70	'D'
//0 <= score < 60	'F'
//Tested values are all between 0 and 100. Theres is no need to check for negative values or values greater than 100.

public class Day5_GradeBook {

    public static void main(String[] args) {
        System.out.println("For Grades 95,90,93 --> " + getGrade(95, 90, 93));
        System.out.println("For Grades 100,85,96 --> " + getGrade(100,85,96));
        System.out.println("For Grades 70,70,100 --> " + getGrade(70,70,100));
        System.out.println("For Grades 84,79,85 --> " + getGrade(84,79,85));
        System.out.println("For Grades 70,70,70 --> " + getGrade(70,70,70));
        System.out.println("For Grades 60,82,76 --> " + getGrade(60,82,76));
        System.out.println("For Grades 65,70,59 --> " + getGrade(65,70,59));
        System.out.println("For Grades 58,62,70 --> " + getGrade(58,62,70));
        System.out.println("For Grades 44,55,52 --> " + getGrade(44,55,52));
        System.out.println("For Grades 0,0,0--> " + getGrade(0,0,0));
    }

    public static char getGrade(int s1, int s2, int s3) {
        int result = (s1 + s2 + s3) / 3;
        if ( result >=90) return 'A';
        else if (result >=80) return 'B';
        else if (result >= 70) return 'C';
        else if (result >=60) return 'D';
        else return 'F';
    }
}
