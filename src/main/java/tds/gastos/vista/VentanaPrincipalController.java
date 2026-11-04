package tds.gastos.vista;

import javafx.application.Platform;
import javafx.fxml.FXML;

/**
 * Controlador de vista de la ventana principal.
 */
public class VentanaPrincipalController {

    @FXML
    private void salir() {
        Platform.exit();
    }

}
