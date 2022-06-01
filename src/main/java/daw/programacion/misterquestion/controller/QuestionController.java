package daw.programacion.misterquestion.controller;

import daw.programacion.misterquestion.bussines.DDBB;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class QuestionController {

    @FXML
    protected TextField textFieldAnswerA;
    @FXML
    protected TextField textFieldAnswerB;
    @FXML
    protected TextField textFieldAnswerC;
    @FXML
    protected TextField textFieldValue;
    @FXML
    protected TextField textFieldCorrectAnswer;
    @FXML
    protected TextField textFieldQuestion;

    @FXML
    public void collectQuestions() {
        int correctAnswer;
        if ((textFieldCorrectAnswer.getText()).compareToIgnoreCase("a") == 0) {
            correctAnswer = 0;
        }
        else if ((textFieldCorrectAnswer.getText()).compareToIgnoreCase("b") == 0) {
            correctAnswer = 1;
        } else correctAnswer = 2;

        DDBB.insertQuestion(textFieldQuestion.getText(), textFieldAnswerA.getText(),
                textFieldAnswerB.getText(), textFieldAnswerC.getText(),
                correctAnswer, Integer.parseInt(textFieldValue.getText()));

    }
}
