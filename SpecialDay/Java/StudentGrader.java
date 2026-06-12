import java.util.Scanner;

import java.util.Random;

import java.util.Arrays;

public class Student{

    public static int [][] collectEachStudentsScore(int numberOfStudents,int numberOfQuizzes){

    int [][] studentQuizScore = new int [numberOfStudents][numberOfQuizzes];
    
    return studentQuizScore;
    }

    public static double [] getStudentsAverage(int [][] eachStudentsScore){

    int numberOfQuiz = eachStudentsScore[0].length;

    int numberOfStudents = eachStudentsScore.length;

    double [] eachStudentsAverage = new double [numberOfStudents];

    int index = 0;

    for(int [] student : eachStudentsScore){

        double averageScore = 0.0;

        for (int quizScore : student){

        averageScore += quizScore;
        }
        eachStudentsAverage[index++] = averageScore/numberOfQuiz;
        }

    return eachStudentsAverage;
    }

    public static double [] getAveragePerQuiz(int [][] eachStudentsScore){

    int numberOfQuiz = eachStudentsScore[0].length;

    int numberOfStudents = eachStudentsScore.length;

    double [] averagePerQuiz = new double[numberOfQuiz];

    int quizAverageIndex = 0;
    
    for(int quiz = 0; quiz < numberOfQuiz; quiz++){

        double quizAverage = 0.0;

        for (int student = 0; student < numberOfStudents; student++){

            quizAverage = quizAverage + eachStudentsScore[student][quiz];
         
            }
        averagePerQuiz[quiz] = quizAverage/numberOfStudents;

        }
    return averagePerQuiz;
    }

}

