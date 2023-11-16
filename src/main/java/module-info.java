module com.example.lab2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.sun.xml.ws;


    opens com.example.lab2 to javafx.fxml, com.sun.xml.ws;
    opens com.example.lab2.webservice to com.sun.xml.bind;
    exports com.example.lab2;
    exports  com.example.lab2.webservice;
}