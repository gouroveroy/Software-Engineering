package Builder;

public class Chinese implements IBuilder {
    @Override
    public String addStarter() {
        return "soup";
    }

    @Override
    public String addMainCourse() {
        return "peking duck";
    }

    @Override
    public String addDessert() {
        return "pudding";
    }

    @Override
    public String getMeal() {
        return "Starter: " + addStarter() + "\nMain dish: " + addMainCourse() + "\nDessert: " + addDessert();
    }
}
