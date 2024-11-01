package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpPageController {
    public Stage stage;
    @FXML
    private ImageView backtoHome;

    @FXML
    void gotoHomePage(MouseEvent event) throws IOException {
        Parent parent= FXMLLoader.load(getClass().getResource("/views/loginPage.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        double width=stage.getWidth();
        double height=stage.getHeight();
        stage.setScene(new Scene(parent));
        stage.show();

    }

}
