package designpattern.singleton;

public class ConnectionPool {

    private static ConnectionPool instance = null;

    private ConnectionPool() {

    }

    public static synchronized ConnectionPool getInstance() {
        if (instance == null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

}
