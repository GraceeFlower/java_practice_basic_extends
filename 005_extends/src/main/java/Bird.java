public class Bird extends Animal {

    int flySpeed;

    public Bird() { }

    public Bird(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    public void flyMode() {
        System.out.println("翱翔");
    }

    public String getFlySpeed() {
        return flySpeed + "km/h";
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

}
