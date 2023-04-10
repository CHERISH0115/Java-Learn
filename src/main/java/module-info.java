module com.example.javalearn {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javalearn to javafx.fxml;
    exports com.example.javalearn;
}