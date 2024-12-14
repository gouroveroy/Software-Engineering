public class Billing implements Department {
    @Override
    public void handleRequest(String request) {
        System.out.println("Billing Department handling request: " + request);
    }
}
