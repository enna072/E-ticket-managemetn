package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {

    @FXML
    private Button LoginButton;

    @FXML
    private TextField PassWorDTextBox;

    @FXML
    private TextField UserNameTextBox;

    @FXML
    private Button ViewAsAGuestButton;

    @FXML
    private Button signup;

    @FXML
    void goTOViewAsAGuest(ActionEvent event) {

    }

    @FXML
    void goToHomePage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/home_page.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }


    @FXML
    void gotoSignupPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/signuppage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
