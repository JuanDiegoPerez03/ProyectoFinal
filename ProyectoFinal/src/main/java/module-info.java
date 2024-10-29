module uq.proyectofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens controller to javafx.fxml;


    opens uq.proyectofinal to javafx.fxml;
    exports uq.proyectofinal;
}