package Builder;

public class Bengali implements IBuilder {
    @Override
    public String addStarter() {
        return "vegetable";
    }

    @Override
    public String addMainCourse() {
        return "chicken curry";
    }

    @Override
    public String addDessert() {
        return "sweet curd";
    }

    @Override
    public String getMeal() {
        return "Starter: " + addStarter() + "\nMain dish: " + addMainCourse() + "\nDessert: " + addDessert();
    }
}
