module SchoolManagementSystem {
    requires javafx.fxml;
    requires javafx.controls;

    opens app to javafx.graphics, javafx.fxml;
    exports app.presentation to javafx.fxml;
}