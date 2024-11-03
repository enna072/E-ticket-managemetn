package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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
        String user_name = UserNameTextBox.getText();
        String password = PassWorDTextBox.getText();
       // if (dataController.validateuserAndpass(user_name, password)) {
            Parent root = FXMLLoader.load(getClass().getResource("/views/home_page.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
//        } else {
//            String title,header,content;
//            Alert alert = new Alert(Alert.AlertType.WARNING);
//            if(user_name.isEmpty()||password.isEmpty()){
//                title="missing input";
//                if(user_name.isEmpty()){
//                    header="User name is missing";
//                    content="Enter user name";
//                }
//                else {
//                    header="password is missing";
//                    content="enter password";
//                }
//            }
//            else{
//                title="Worng input";
//                header="password doesn't match with the username";
//                content="enter correct password";
//            }
//            alert.setTitle(title);
//            alert.setHeaderText(header);
//            alert.setContentText(content);
//            alert.showAndWait();
//
//        }
    }


    @FXML
    void gotoSignupPage(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/signuppage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
