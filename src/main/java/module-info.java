module com.mycompany.blockbuster {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    opens com.mycompany.blockbuster to javafx.fxml;
    exports com.mycompany.blockbuster;
    
}
