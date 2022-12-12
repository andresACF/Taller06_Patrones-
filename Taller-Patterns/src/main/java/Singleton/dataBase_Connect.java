/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Singleton;

import java.sql.*;


public class dataBase_Connect {
    
    private static Connection connected;
    private static dataBase_Connect instance;

    private dataBase_Connect() {
        //constructor vacio y privado
    }
  
    private static final String URL= "jdbc:mysql:localhost/Tienda";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
    public Connection connect(){
        //se omite
        return connected;
    }
    
    public Connection  disconnect(){
        //se omite
        return connected;
    }
    
    public static dataBase_Connect getInstance(){
        if(instance==null)
            instance = new dataBase_Connect();
        return instance;
   }
}

