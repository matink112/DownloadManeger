package controller;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.controls.JFXTreeTableView;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class mainPageController {

    private FXMLLoader mainPageLoader;
    private Stage mainPageStage;



    @FXML
    private ImageView addUrlbtn;

    @FXML
    private ImageView removebtn;

    @FXML
    private ImageView stopAllbtn;

    @FXML
    private ImageView stopbtn;

    @FXML
    private ImageView timebtn;

    @FXML
    private ImageView settingbtn;

    @FXML
    private JFXTextField searchField;

    @FXML
    private JFXTreeTableView<?> TreeTable;

    @FXML
    private TreeTableColumn<?, ?> categoryCoulmn;

    @FXML
    private TableView<?> table;

    @FXML
    private TableColumn<?, ?> nameCoulmn;

    @FXML
    private TableColumn<?, ?> sizeCoulmn;

    @FXML
    private TableColumn<?, ?> statusCoulmn;

    @FXML
    private TableColumn<?, ?> locationCaulmn;

    @FXML
    private Label leftStatuslbl;

    @FXML
    private Font x3;

    @FXML
    private Color x4;

    @FXML
    private Label rightStatuslbl;

    @FXML
    private Font x5;

    @FXML
    private Color x6;

    //////////////////////////////////////////////////////public function



    ///////////////////////////////////////////////////////private function




    ////////////////////////////////////////////////////////////////setter and getter function

    public void setMainPageStage(Stage mainPageStage) {
        this.mainPageStage = mainPageStage;
    }

    public void setMainPageLoader(FXMLLoader mainPageLoader) {
        this.mainPageLoader = mainPageLoader;
    }
}
