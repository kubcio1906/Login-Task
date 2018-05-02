package pl.Akademia.Kodu;

import org.apache.commons.codec.digest.DigestUtils;

import java.sql.*;

public class DBConnection {
    public static Connection connect = null;

    public static void connect() {

        // Setup the connection with the DB
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    .getConnection("jdbc:mysql://localhost/LoginPanel?"
                            + "user=root&password=");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertUser(User user) {
        try {
            String sqlInsert = "INSERT INTO tuser (login, password, name, surname)" +
                    " VALUES (?, ?, ?,?);";

            PreparedStatement preparedStatement = connect.prepareStatement(sqlInsert);

            preparedStatement.setString(1, user.getLogin());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getName());
            preparedStatement.setString(4, user.getSurmane());

            preparedStatement.executeUpdate();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
    public static boolean authentic(String login, String pass){
        try{
            String sqlSelect = "SELECT password from tuser WHERE login = '"+login+"';";
            Statement s = connect.createStatement();
            ResultSet resultSet = s.executeQuery(sqlSelect);
            while(resultSet.next()){
               if (DigestUtils.md5Hex(pass).equals(resultSet.getString("password"))){
                    return true;
                }else{
    return false;
                }
                }
                return false;
            } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        }
    }



