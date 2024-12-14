public class Inventory implements Department {
    @Override
    public void handleRequest(String request) {
        System.out.println("Inventory Department handling request: " + request);
    }
}
