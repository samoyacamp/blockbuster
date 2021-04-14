package com.mycompany.blockbuster.DAO;

import com.mycompany.blockbuster.models.Actor;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author konra
 */
public class ActorDAO {
    private Connection conexion;
   
    public void conectar() throws ClassNotFoundException, SQLException,IOException{
        String host="localhost";
        String port="3306";
        String dbname="blockbuster";
        String username="root";
        String password="paco123";
        //El connectionsting quedaria asi : jdbc:mariadb://localhost:3306/blockbuster?serverTimezone=UTC...username y password
       
        conexion=DriverManager.getConnection("jdbc:mariadb://" + host + ":" +
                port + "/" + dbname + "?serverTimezone=UTC",username,password);
    }
    public void desconectar() throws SQLException {
        conexion.close();
    }
    public List<Actor> listActores() throws SQLException {
        List<Actor> actores = new ArrayList<>();
        String sql = "SELECT * FROM actor";
        PreparedStatement sentencia = conexion.prepareStatement(sql) ;
       
        ResultSet resultado = sentencia.executeQuery();
       
        while(resultado.next()){
            Actor a = new Actor();
            a.setNombre(resultado.getString(1));
            a.setNacionalidad(resultado.getString(2));
            a.setSexo(resultado.getString(3).charAt(0));
           
            actores.add(a);
           
        }
        return actores;
       
       
    }
}
	
