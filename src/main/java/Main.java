import dao.UserDAOJDBCImpl;
import dao.UserDao;
import model.User;
import util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDAOJDBCImpl();
        userDao.createUserTable();
        userDao.saveUser("Иван", "Иванов", (byte)45);
        //userDao.dropUserTable();

    }
}