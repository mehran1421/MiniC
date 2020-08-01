package contorler;

import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.effects.JFXDepthManager;
import compiler.visit.MyVisitor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.antlr.v4.runtime.ANTLRInputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ControlInputFIle implements Initializable {
    @FXML
    private JFXTextArea intputii;
    //================================================================
    public static String s;

    //================================================================
    @FXML
    void submit(ActionEvent event) {
        try {
            if (!intputii.getText().equals("") & intputii.getText() != null) {
                ANTLRInputStream input = new ANTLRInputStream(new ByteArrayInputStream(intputii.getText().getBytes(StandardCharsets.UTF_8)));
                ArrayList<String> result = MyVisitor.isAcceptInput(input);

                StringBuilder tempText = new StringBuilder();
                for (int i = 0; i < result.size(); i++) {
                    if (i == result.size() - 1)
                        tempText.append(result.get(i));
                    else
                        tempText.append(result.get(i)).append("\n");
                }
                Text bodyText = new Text(tempText.toString());
                s = bodyText.getText();
            }
            Parent parent = FXMLLoader.load(getClass().getResource("/resource/fxmlfile/result.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            System.out.println("can play result page!!!");
        }
    }
    //=========================================================================
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        JFXDepthManager.setDepth(intputii, 10);
    }
}
