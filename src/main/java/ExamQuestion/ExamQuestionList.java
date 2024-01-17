package ExamQuestion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExamQuestionList {

    private List<ExamQuestion> examQuestions;

    // Konstruktør
    public ExamQuestionList(List<ExamQuestion> examQuestions) {
        this.examQuestions = examQuestions;
    }

    // Metode til at skrive examQuestions til en fil
    public void writeToFile() {
        try (FileWriter writer = new FileWriter("questions.txt")) {
            for (ExamQuestion question : examQuestions) {
                writer.write("Question " + question.getQuestionNumber() + ": Grade ");
            }
            System.out.println("Questions written to 'questions.txt'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metode til at udskrive listen til skærmen
    public void printListToScreen() {
        for (ExamQuestion question : examQuestions) {
            System.out.println("Question " + question.getQuestionNumber() + ": Grade " + question.getGrade());
        }
    }
}
