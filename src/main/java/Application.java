import MyException.DatabaseConnectionErrorException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
	public static void main(String[] args) {

		final String user = "myUser";
		final String password = "123";
		final String url = "jdbc:postgresql://localhost:5432/myDB";

		try (Connection connection = DriverManager.getConnection(url, user, password)) {
			System.out.println("Successful database connection");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DatabaseConnectionErrorException();
		}
	}
}
