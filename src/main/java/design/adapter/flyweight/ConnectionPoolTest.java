package design.adapter.flyweight;

import java.sql.Connection;

public class ConnectionPoolTest {
	public static void main(String[] args) {
		ConnectionPool connectionPool = new ConnectionPool();
		Connection connection = connectionPool.getConnection();
		System.out.println("Connection" + connection);
		connectionPool.release();
	}
}
