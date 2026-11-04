module tds.gastos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens tds.gastos.vista to javafx.fxml;

    exports tds.gastos;
}
