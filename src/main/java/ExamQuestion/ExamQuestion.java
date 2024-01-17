package ExamQuestion;

import java.util.Random;

public class ExamQuestion {

    private int number;

    private char grade;

    // Konstruktør
    public ExamQuestion(int number) {
        this.number = number;
        this.grade = generateRandomGrade();
    }

    // Metode til at generere en tilfældig karakter (A, B, C, D, E eller F)
    public char generateRandomGrade() {
        Random random = new Random();
        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
        return grades[random.nextInt(grades.length)];
    }

    // Metode til at få nummerede examquestions
    public int getQuestionNumber() {
        return number;
    }

    // Metode til at få karakteren
    public char getGrade() {
        return grade;
    }
}
