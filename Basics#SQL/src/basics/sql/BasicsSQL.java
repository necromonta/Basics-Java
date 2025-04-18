/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basics.sql;
import java.sql.*;
import java.util.ArrayList;



/**
 *
 * @author anagy
 */
public class BasicsSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception { 
      createTable();
      // insertData();
       getDatas();
    }
    public static  ArrayList<String> getDatas(){
 ArrayList<String> array=new ArrayList();
        try{
            Connection con= getConnection();
        PreparedStatement statement=con.prepareStatement("SELECT first,last FROM names ORDER BY first asc");
        ResultSet result=statement.executeQuery();
       
        while(result.next()){
             array.add(result.getString("last"));
             array.add(result.getString("first"));
        }
        }
        catch(Exception e){
            System.out.println(e);
        }  
        System.out.println("Array:");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        return array;
    }
    
    public static void insertData(){
        String name1="Adrian";
        String name2="Laci";
        try{
            Connection con= getConnection();
        PreparedStatement insert=con.prepareStatement("INSERT INTO names(first,last) VALUES('"+name1+"','"+name2+"')");
        insert.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void createTable() throws Exception{
        try{
            Connection con= getConnection();
        PreparedStatement create =con.prepareStatement("CREATE TABLE IF NOT EXISTS names(id int NOT NULL AUTO_INCREMENT, first varchar(255), last varchar(255), PRIMARY KEY(id))");
        create.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
                    
    }


 public static Connection getConnection() throws Exception{
  try{
   String url = "jdbc:mysql://localhost:3306/kekszalag";
   String username = "root";
   String password = "";
  
   
   Connection conn = DriverManager.getConnection(url,username,password);
   System.out.println("Connected");
   return conn;
  } catch(SQLException e){System.out.println(e);}
  
  
  return null;
 }

}
