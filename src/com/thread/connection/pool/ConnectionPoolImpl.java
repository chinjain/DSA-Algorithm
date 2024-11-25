package com.thread.connection.pool;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Queue;

public class ConnectionPoolImpl implements ConnectionPool {

	private final Driver driver;
	private final String jdbcUrl;
	private final String username;
	private final String password;
	private final int maxPoolSize;
	private int size;
	private final Queue<Connection> connections;

	public ConnectionPoolImpl(String driverClassName, String jdbcUrl, String username, String password,
			int maximumPoolSize) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

		Class c = Class.forName(driverClassName);
		this.driver = (Driver) c.newInstance();

		this.jdbcUrl = jdbcUrl;
		this.username = username;
		this.password = password;
		this.maxPoolSize = maximumPoolSize;
		this.size = 0;
		this.connections = new LinkedList<Connection>();
	}

	@Override
	public Connection getConnection() throws SQLException, InterruptedException {
		// TODO Auto-generated method stub
		return getConnection(0);
	}

	@Override
	public Connection getConnection(long timeout) throws SQLException, InterruptedException {

		long timeStamp = System.currentTimeMillis() + timeout;
		boolean createNewConnection = false;

		synchronized (this) {
			while (connections.isEmpty()) {
				if (size < maxPoolSize) {
					size++;
					createNewConnection = true;
					break;
				} else {
					this.wait(Math.max(timeStamp - System.currentTimeMillis(), 1));

					if (timeStamp <= System.currentTimeMillis()) {
						throw new SQLException();
					}

				}
			}

			if (!createNewConnection) {
				return connections.poll();
			}

		}

		return createNewConnection();
	}

	private Connection createNewConnection() throws SQLException {
		try {

			Properties info = new Properties();
			info.put("user", username);
			info.put("password", password);

			return driver.connect(jdbcUrl, info);

		} catch (Throwable t) {
			synchronized (this) {
				size--;
				this.notifyAll();
			}

			t.printStackTrace();
			throw new SQLException("Connection not available", t);
		}
	}

	@Override
	public Connection getConnection(Connection connection) {
		// TODO Auto-generated method stub
		return null;
	}

}
