package ExamQuestion;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Opret en liste af ExamQuestions
        List<ExamQuestion> examQuestion = new ArrayList<>();
        for (int i = 1; i <= 14; i++) {
            examQuestion.add(new ExamQuestion(i));
        }

        // Opret en instance af ExamQuestionList
        ExamQuestionList examQuestionList = new ExamQuestionList(examQuestion);

        // Udskriv listen til skærmen
        examQuestionList.printListToScreen();

        // Udskriv listen til en fil
        examQuestionList.writeToFile();
    }
}
