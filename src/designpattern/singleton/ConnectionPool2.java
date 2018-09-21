package designpattern.singleton;

public class ConnectionPool2 {

    private static ConnectionPool2 instance = null;

    private ConnectionPool2() {

    }

    public static ConnectionPool2 getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new ConnectionPool2();
                }
            }
        }
        return instance;
    }

}
