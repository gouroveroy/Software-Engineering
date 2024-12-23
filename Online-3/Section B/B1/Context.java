public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void run() {
        while (true) {
            state.stay(this);
        }
    }
}
