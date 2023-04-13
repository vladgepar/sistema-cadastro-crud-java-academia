/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.Connection;

/**
 *
 * @author VladGepar
 */
public class ConnectionFactory {

    public Connection getConnection() {
        try {
            return 
              //Tentar Estabelecer a Conexão com o Servidor
              DriverManager.getConnection("jdbc:mysql://localhost/academiaflow", "root", "");

        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);

        }
    }

}
