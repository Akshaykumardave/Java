package opps.SingletonClass;

class Database {
    private static Database dbObject;

    private Database() {
    }

    public static Database getInstance() {
        if(dbObject ==  null) {
            dbObject = new Database();
        }

        return dbObject;
    }

    public void getConnection() {
        System.out.println("Connected to the database");
    }
}


public class SimpleSingletonClass {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.getConnection();
    }
}
