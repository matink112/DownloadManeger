import controller.mainPageController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("view/mainPage.fxml"));

        try{
            loader.load();
        }catch (Exception e){
            System.out.println("Error while loading Page");
        }

        primaryStage.setScene(new Scene(loader.getRoot()));

        mainPageController controller = loader.getController();
        controller.setMainPageLoader(loader);
        controller.setMainPageStage(primaryStage);

        primaryStage.setTitle("Download Manager");
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
