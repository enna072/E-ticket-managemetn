package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpPageController {
    public Stage stage;
    @FXML
    private ImageView backtoHome;
    @FXML
    private Button joinButton;
    @FXML
    void gotoHomePage(MouseEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/views/loginPage.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        double width=stage.getWidth();
        double height=stage.getHeight();
        stage.setScene(new Scene(parent));
        stage.show();

    }


    @FXML
    void goToCongratulationPage(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("/views/confirm_sign_up.fxml"));
        Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }



}
