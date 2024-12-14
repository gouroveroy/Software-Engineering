public class Main {
    public static void main(String[] args) {
        SQLDatabase sqlDatabase = new SQLDatabase();
        DatabaseQuery databaseAdapter = new DatabaseAdapter(new NoSQLDatabase());
        sqlDatabase.executeQuery("SELECT * FROM users");
        databaseAdapter.executeQuery("SELECT * FROM users");
    }
}
