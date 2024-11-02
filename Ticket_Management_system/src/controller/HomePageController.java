package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    @FXML
    private HBox gotoBookABus;

    @FXML
    void gotoBookABus(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/views/Find_bus_Page.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

}
