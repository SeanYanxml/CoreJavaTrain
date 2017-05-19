package design.adapter.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 享元模式 最普遍的模式 线程池
 * */
public class ConnectionPool {
	
	private Vector<Connection> pool;
	
	/*public attribute*/
	private String url="jdbc:mysql://localhost:3306/test";
	private String userName="root";
	private String password="admin";
	private String driverClassName="com.mysql.jdbc.Driver";
	
	private int poolSize=100;
	private static ConnectionPool instance = null;
	Connection connection = null; 
	
	public ConnectionPool(){
		pool = new Vector<Connection>(poolSize);
		
		for(int i=0;i<poolSize;i++){
			try{
				Class.forName(driverClassName);
				connection = DriverManager.getConnection(url,userName,password);
				pool.add(connection);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void release(){
		pool.add(connection);
	}
	
	public synchronized Connection getConnection(){
		if(pool.size()>0){
			Connection connection = pool.get(0);
			pool.remove(connection);
			return connection;
		}else{
			return null;
		}
	}

}
