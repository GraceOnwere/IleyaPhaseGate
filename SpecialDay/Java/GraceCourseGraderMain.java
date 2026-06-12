import java.util.Scanner;

import java.util.Random;

import java.util.Arrays;

public class GraceCourseGraderMain{

    public static void main(String[] args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.print("Enter Number of Students: ");

    int numberOfStudents = inputCollector.nextInt();

    System.out.print("Enter number of Quizzes: ");

    int numberOfQuizzes = inputCollector.nextInt();

    System.out.println();

    int [][] eachStudentsScore = GraceCourseGrader.collectEachStudentsScore(numberOfStudents,numberOfQuizzes);

    int studentCount = 1;

    for (int count = 0; count < eachStudentsScore.length; count++){

    System.out.printf("--- Student %d ---%n", studentCount);

    int quizCount = 1;

        for (int counter = 0; counter < eachStudentsScore[0].length; counter++){
        
        System.out.printf("Score for Quiz %d: ",quizCount);

        int quizScore = inputCollector.nextInt();

        while(quizScore < 0 || quizScore > 100){
        
            System.out.println("Student Quiz Score should be between 0-100");

            System.out.printf("Score for Quiz %d: ",quizCount);

            quizScore = inputCollector.nextInt();
        }
    
    eachStudentsScore[count][counter] = quizScore;
    quizCount++;
    }
    studentCount++;
    System.out.println();
    
        }
    double [] eachStudentsAverage = GraceCourseGrader.getStudentsAverage(eachStudentsScore);

    double [] averagePerQuiz = GraceCourseGrader.getAveragePerQuiz(eachStudentsScore);

    double maxmiumAveragePerQuiz = GraceCourseGrader.getBestQuiz(averagePerQuiz);

    System.out.println("=============== QUIZ GRADE REPORT =============");

    System.out.println();

    System.out.println("STUDENT\tQZ1\tQZ2\tQZ3\tAVG");

    System.out.println("-----------------------------------------------");

    for(int count = 1; count <= numberOfStudents; count++){

    System.out.printf("Student %d%n",numberOfStudents);
    }
    
    }

}
