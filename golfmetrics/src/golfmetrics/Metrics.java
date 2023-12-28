package golfmetrics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Metrics {
    public static void main(String[] args) throws ClassNotFoundException
    {
     // load the sqlite-JDBC driver using the current class loader
     Class.forName("org.sqlite.JDBC");

     Connection connection = null;
     try
     {
        // create a database connection
        connection = DriverManager.getConnection("jdbc:sqlite:metrics.db");

        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);  // set timeout to 30 sec.


        statement.executeUpdate("DROP TABLE IF EXISTS green");
        statement.executeUpdate("CREATE TABLE green (id INTEGER, result STRING)");

        int ids [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        String results [] = {"Hit","Miss"};

        for(int i=0;i<ids.length;i++){
        	int result = i % 2;
             statement.executeUpdate("INSERT INTO green values('"+ ids[i]+"', '"+results[result]+"')");   
        }

        //statement.executeUpdate("UPDATE person SET name='Peter' WHERE id='1'");
        //statement.executeUpdate("DELETE FROM person WHERE id='1'");

          ResultSet resultSet = statement.executeQuery("SELECT * from green");
          while(resultSet.next())
          {
             // iterate & read the result set
             System.out.println("result = " + resultSet.getString("result"));
             System.out.println("id = " + resultSet.getInt("id"));
          }
         }

     catch(SQLException e){  System.err.println(e.getMessage()); }       
      finally {         
            try {
                  if(connection != null)
                     connection.close();
                  }
            catch(SQLException e) {  // Use SQLException class instead.          
               System.err.println(e); 
             }
      }
  }
}
