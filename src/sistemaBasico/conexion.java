/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaBasico;

/**
 * clase conexion clase que permitira conectarese con la base de datos en xampp
 *
 * @author oscar
 * @version 1.0
 */
//importar las librerias de las herramientas a usar
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    //01.- declarar una varialbe que permita ejecutar las actividades de la BD desde java

    Connection cn = null;

    //2 definir un metedo que permita estavlecer la conexion con la bd desde java
    public Connection conexionBD() {

        try {
            //2.1 definir el tipo de lenguaje a utilizar como base de datos desde java
            Class.forName("com.mysql.jdbc.Driver");
            //2.2 definir la ruta donde se encuentra la BD
            cn = DriverManager.getConnection("jdbc:mysql://localhost/empresa", "root", "");
            //2.3 mensaje de conexion
            JOptionPane.showMessageDialog(null, "CONEXION ESTABLECIDA", "CONEXION A BD", JOptionPane.WARNING_MESSAGE);
            
        } catch (ClassNotFoundException ex) {
            System.getLogger(conexion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (SQLException ex) {
            System.getLogger(conexion.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        //2.5 DEVOLVER EL RESULTADO DE LA CONEXION
        return cn;
    }

}
