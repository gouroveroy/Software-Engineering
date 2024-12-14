public class DatabaseAdapter implements DatabaseQuery {
    private NoSQLDatabase noSQLDatabase;

    public DatabaseAdapter(NoSQLDatabase noSQLDatabase) {
        this.noSQLDatabase = noSQLDatabase;
    }

    @Override
    public void executeQuery(String query) {
        noSQLDatabase.runQuery(query);
    }
}
