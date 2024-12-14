public class RedState implements State {
    public void stay(Context context) {
        System.out.println("The light is RED. Stop!");
        try {
            Thread.sleep(1000 * 5); // Wait for 5 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        context.setState(new YellowState());
    }
}
