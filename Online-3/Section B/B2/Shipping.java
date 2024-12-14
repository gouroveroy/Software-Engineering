public class Shipping implements Department {
    @Override
    public void handleRequest(String request) {
        System.out.println("Shipping Department handling request: " + request);
    }
}
