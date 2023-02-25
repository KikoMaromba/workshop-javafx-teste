module com.kaiquebsantos.fxteste {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.kaiquebsantos.fxteste to javafx.fxml;
    exports com.kaiquebsantos.fxteste;
}