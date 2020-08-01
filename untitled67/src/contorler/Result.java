package contorler;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.effects.JFXDepthManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Result implements Initializable {
    @FXML
    private AnchorPane anchor;
    //==================================================
    @FXML
    private JFXTextArea result;
    //==================================================
    @FXML
    private JFXButton ok;
    //==================================================
    @FXML
    void okbut(ActionEvent event) {
        ((Stage) anchor.getScene().getWindow()).close();
    }
    //===================================================
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        JFXDepthManager.setDepth(ok, 10);
        result.setText(ControlInputFIle.s);
    }
}