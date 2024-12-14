public class FormalFactory implements AFactory {
    @Override
    public Letter createLetter() {
        return new FormalLetter();
    }

    @Override
    public Resume createResume() {
        return new FormalResume();
    }
}
