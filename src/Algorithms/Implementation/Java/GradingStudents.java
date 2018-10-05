package Algorithms.Implementation.Java;

public class GradingStudents {

    public static void main(String[] args) {

        int[] grades = {73, 67, 38, 33};

        int[] resut = gradingStudents(grades);

        for (int i = 0; i < resut.length; i++) 
            System.out.println(resut[i]);
    }

    static int[] gradingStudents(int[] grades) {

        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {

            if ((grades[i] + 1) % 5 == 0 && (grades[i] >= 38))
                roundedGrades[i] = grades[i] + 1;
            else if ((grades[i] + 2) % 5 == 0 && (grades[i] >= 38))
                roundedGrades[i] = grades[i] + 2;
            else 
                roundedGrades[i] = grades[i];
        }

        return roundedGrades;
    }
}
