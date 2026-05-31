module joaocamilo.potencia2009.estacionamento_ui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens joaocamilo.potencia2009.estacionamento_ui to javafx.fxml;
    exports joaocamilo.potencia2009.estacionamento_ui;
}