package tds.gastos;

import tds.gastos.negocio.controladores.ControladorGastos;

public class ConfiguracionImpl extends Configuracion {

    private final ControladorGastos controlador;

    public ConfiguracionImpl() {
        // TODO: pasar aquí las implementaciones JDBC de los repositorios cuando existan
        this.controlador = new ControladorGastos();
    }

    @Override
    public ControladorGastos getControladorGastos() {
        return controlador;
    }

}
