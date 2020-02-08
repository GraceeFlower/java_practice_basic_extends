public class Hawk extends Bird {
    String prey;

    public Hawk() { }

    public Hawk(String prey) {
        this.prey = prey;
    }

    public void predate() {
        System.out.println("Predate prey!");
    }

}
