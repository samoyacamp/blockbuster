package com.mycompany.blockbuster;

import com.mycompany.blockbuster.DAO.ActorDAO;
import com.mycompany.blockbuster.models.Actor;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class PrimaryController {

    @FXML
    private ListView listado;

    @FXML
    private void showActors() throws IOException {
//      App.setRoot("secondary");
        ActorDAO adao = new ActorDAO();
        List<Actor> actores = new ArrayList<Actor>(); 
        try {
            adao.conectar();
            AlertsUtil.mostrarInfo("conexion sin errores");
            actores = adao.listActores();
            listado.setItems(FXCollections.observableList(actores));
        } catch (ClassNotFoundException ex) {
            AlertsUtil.mostrarError(ex.getMessage());
        } catch (SQLException ex) {
            AlertsUtil.mostrarError(ex.getMessage());
        }
    }
}
