module PRAKTIKUM6 {
    requires javafx.controls;
    requires javafx.fxml;

    opens PRAKTIKUM6 to javafx.fxml;
    exports PRAKTIKUM6;
}