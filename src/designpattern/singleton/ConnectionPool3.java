package designpattern.singleton;

public class ConnectionPool3 {

	private static final ConnectionPool3 instance = new ConnectionPool3();

	private ConnectionPool3() {

	}

	public static ConnectionPool3 getInstance() {
		return instance;
	}
}
