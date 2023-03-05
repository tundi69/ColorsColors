module com.example.colorscolors {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.colorscolors to javafx.fxml;
    exports com.example.colorscolors;
}