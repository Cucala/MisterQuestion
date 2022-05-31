package daw.programacion.misterquestion.controller;

import daw.programacion.misterquestion.MisterQuestionApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    protected void goToQuestion() throws IOException {
        FXMLLoader loader = new FXMLLoader(MisterQuestionApplication.class.getResource("answerView.fxml"));
        QuestionController controller = new QuestionController();
        loader.setController(controller);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        MisterQuestionApplication.window.setScene(scene);
        MisterQuestionApplication.window.show();
    }
}