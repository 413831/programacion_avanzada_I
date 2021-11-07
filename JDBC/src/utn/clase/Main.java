package utn.clase;

import java.sql.*;

public class Main {

    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "admin");

            PreparedStatement query = connection.prepareStatement("select * from Personas");
            ResultSet resultSet = query.executeQuery();

            PreparedStatement insert = connection.prepareStatement("insert into Personas (nombre) values (?)");
            insert.setString(2,"Ines");
            insert.execute();


            while(resultSet.next())
            {
                String valor = resultSet.getString(2);
                System.out.println("valor = " + valor);
            }
            connection.close();
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
}
