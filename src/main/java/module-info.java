module sample.demogit {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.demogit to javafx.fxml;
    exports sample.demogit;
}