module com.example._5weekswithoutlaptop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example._5weekswithoutlaptop to javafx.fxml;
    exports com.example._5weekswithoutlaptop;
}