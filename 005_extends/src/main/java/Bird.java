public class Bird extends Animal {

    private int flySpeed;

    public Bird() { }

    public Bird(String specie, int age, int weight, int flySpeed) {
        super(specie, age, weight);
        this.flySpeed = flySpeed;
    }

    public void fly() {
        System.out.println("翱翔天空");
    }

    public String getFlySpeed() {
        return flySpeed + "km/h";
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

}
