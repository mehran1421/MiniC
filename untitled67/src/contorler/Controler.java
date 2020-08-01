package contorler;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.effects.JFXDepthManager;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controler implements Initializable {

    @FXML
    private JFXButton start;
    //====================================================================
    @FXML
    private JFXButton exit;
    //====================================================================
    @FXML
    private AnchorPane annch;
    //====================================================================
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        JFXDepthManager.setDepth(start, 10);
        JFXDepthManager.setDepth(exit, 10);
    }
    //===================================================================
    @FXML
    void loadMain(ActionEvent actionEvent) {
        ((Stage) annch.getScene().getWindow()).close();
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/resource/fxmlfile/inputfile.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            System.out.println("cant play input page!");
        }
    }
    //===========================================================================
    @FXML
    void exit(ActionEvent event) {

        System.exit(1);
    }

}
