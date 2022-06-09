module SchoolManagementSystem {
    requires javafx.fxml;
    requires javafx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.core;
    requires org.kordamp.ikonli.fontawesome;

    opens app to javafx.graphics, javafx.fxml;
    opens app.presentation to javafx.fxml;
    exports app.presentation to javafx.fxml;
}