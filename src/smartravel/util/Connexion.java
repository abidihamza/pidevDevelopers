/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartravel.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Belgacem
 */

public class Connexion {
   private static final  String driver = "com.mysql.jdbc.Driver";
   private static final  String url   = "jdbc:mysql://localhost:3306/smartravel";
   private static final  String login = "root" ;
   private static final  String pwd   = "" ;
   private static Connection con ; 


   private Connexion(){
   }

   public Connection etablirConnection(){
        try {
            //chargement du Driver
            Class.forName(driver);
            // etablissement de la connexion
            con = DriverManager.getConnection(url,login,pwd);
            System.out.println("Connexion établie");
        } catch (ClassNotFoundException ex) {
            //Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erreur de chargement de driver"+ex.getMessage());
        } catch (SQLException ex){
            System.out.println("probleme d'etablissement de connection"+ex.getMessage());
        }
          return con;
        }
   
   public static Connection getInstance(){
       if (con==null){
           
          new Connexion().etablirConnection();
       }
         return con;
       }
  }

    

