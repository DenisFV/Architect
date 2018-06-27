import java.sql.*;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws SQLException {
        String url = "jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName+"?useSSL=true";
        dbConnection = DriverManager.getConnection(url,dbUser,dbPass);
        return dbConnection;
    }

    void registration(User user) throws SQLException {

        String insert = "INSERT INTO "+ Const.USERS_TABLE+"("
                + Const.USERS_NAME+","+ Const.USERS_SURNAME+","+ Const.USERS_PATRONYMIC+","+ Const.USERS_GENDER+","
                + Const.USERS_PASSPORT+","+ Const.USERS_PHONE+")"+"VALUES(?,?,?,?,?,?,)";

        PreparedStatement prSt = getDbConnection().prepareStatement(insert);
        prSt.setString(1,user.getName());
        prSt.setString(2,user.getSurname());
        prSt.setString(3,user.getPatronymic());
        prSt.setString(4,user.getGender());
        prSt.setString(5,user.getPassport());
        prSt.setString(6,user.getPhone());

        prSt.executeUpdate();
    }
}