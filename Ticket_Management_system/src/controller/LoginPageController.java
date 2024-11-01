package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {
    public Stage stage;
    @FXML
    private Button signup;

    @FXML
    void gotoSignupPage(ActionEvent event) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("/views/signuppage.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
