module edu.snpp.proyecto1github {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.snpp.proyecto1github to javafx.fxml;
    exports edu.snpp.proyecto1github;
}