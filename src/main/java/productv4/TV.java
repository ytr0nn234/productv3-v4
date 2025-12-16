package productv4;

public class TV extends Product {
    private String screenSize;
    private String manufacture;

    public TV() {
        super();
        screenSize = "";
        manufacture = "";
        count++;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacture + "\nScreen size is " + screenSize;
    }
}