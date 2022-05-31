module daw.programacion.misterquestion {
    requires javafx.controls;
    requires javafx.fxml;


    opens daw.programacion.misterquestion to javafx.fxml;
    exports daw.programacion.misterquestion;
    exports daw.programacion.misterquestion.controller;
    opens daw.programacion.misterquestion.controller to javafx.fxml;
}