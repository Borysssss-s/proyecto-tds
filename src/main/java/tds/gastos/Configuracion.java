package tds.gastos;

import tds.gastos.negocio.controladores.ControladorGastos;
import tds.gastos.vista.SceneManager;

/**
 * Almacena los diferentes controladores y servicios de la aplicación (Singleton).
 *
 * El programa principal debe utilizar una subclase de {@link Configuracion}
 * donde se configuran las implementaciones concretas de los servicios:
 *
 * <pre>
 *      Configuracion.setInstancia(configuracionConcreta)
 * </pre>
 *
 * El resto de clases acceden a esta configuración para obtener esos objetos.
 */
public abstract class Configuracion {

    private static Configuracion instancia;
    private final SceneManager sceneManager = new SceneManager();

    /**
     * Solo debe ser invocado desde App
     */
    static void setInstancia(Configuracion impl) {
        Configuracion.instancia = impl;
    }

    public static Configuracion getInstancia() {
        return Configuracion.instancia;
    }

    public SceneManager getSceneManager() {
        return sceneManager;
    }

    public abstract ControladorGastos getControladorGastos();

}
