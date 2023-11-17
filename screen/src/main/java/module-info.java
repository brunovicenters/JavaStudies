module screen.swing {
    requires javafx.controls;
    requires javafx.fxml;

    opens screen.swing to javafx.fxml;
    exports screen.swing;
}
