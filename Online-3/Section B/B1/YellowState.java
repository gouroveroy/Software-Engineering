public class YellowState implements State {
    public void stay(Context context) {
        System.out.println("The light is YELLOW. Get Ready!");
        try {
            Thread.sleep(1000 * 2); // Wait for 2 seconds
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        context.setState(new GreenState());
    }
}
