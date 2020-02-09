public class Hawk extends Bird {

    Animal prey;

    public Hawk() { }

    public Hawk(int age, int weight, Animal prey) {
        super.age = age;
        super.weight = weight;
        this.prey = prey;
    }

    public Animal getPrey() {
        return prey;
    }

    public void setPrey(Animal prey) {
        this.prey = prey;
    }

    public void predate() {
        System.out.println("Predate prey!");
    }

}
