public class InformalFactory implements AFactory {
    @Override
    public Letter createLetter() {
        return new InformalLetter();
    }

    @Override
    public Resume createResume() {
        return new InformalResume();
    }
}
