module calculator.app.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens calculator.app.calculator to javafx.fxml;
    exports calculator.app.calculator;
}