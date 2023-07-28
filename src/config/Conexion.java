
package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    //variable conection con
    Connection con;
    //crear el metodo conexion
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3310/registros","root","");
        }catch (Exception e){
        }
    }
    //metodo para retornar el valor de la conexion
    public Connection getConnection(){
        return con;
    }
}
