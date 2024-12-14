public class GreenState implements State {
    public void stay(Context context) {
        System.out.println("The light is GREEN. Go!");
        try {
            Thread.sleep(1000 * 10); // Wait for 10 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        context.setState(new RedState());
    }
}
