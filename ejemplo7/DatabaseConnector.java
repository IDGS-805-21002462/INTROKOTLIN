public class DatabaseConnector {
    private static DatabaseConnector instance;
    private String connectionString;

    private DatabaseConnector() {
        this.connectionString = "jdbc:mysql://localhost:3306/pruebaSingleton";
    }

    public static synchronized DatabaseConnector getInstance() {
        if (instance == null) {
            instance = new DatabaseConnector();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conectado a: " + connectionString);
    }
}
