package tds.gastos;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Punto de entrada de la aplicación (interfaz gráfica JavaFX).
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Inicialización
        Configuracion configuracion = new ConfiguracionImpl();
        Configuracion.setInstancia(configuracion);
        configuracion.getSceneManager().inicializar(stage);

        // Inicio de la aplicación
        configuracion.getSceneManager().showVentanaPrincipal();
    }

    public static void main(String[] args) {
        launch();
    }

}
