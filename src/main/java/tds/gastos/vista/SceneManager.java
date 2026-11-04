package tds.gastos.vista;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import tds.gastos.App;

/**
 * Se encarga de coordinar la navegación entre ventanas.
 */
public class SceneManager {

    private Stage stage;
    private Scene escenaActual;

    public void inicializar(Stage stage) {
        this.stage = stage;
        stage.setTitle("Gestión de Gastos");
    }

    public void showVentanaPrincipal() {
        cargarYMostrar("VentanaPrincipal");
    }

    private void cargarYMostrar(String fxml) {
        try {
            Parent root = loadFXML(fxml);
            if (escenaActual == null) {
                escenaActual = new Scene(root);
                stage.setScene(escenaActual);
                stage.show();
            } else {
                escenaActual.setRoot(root);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

}
