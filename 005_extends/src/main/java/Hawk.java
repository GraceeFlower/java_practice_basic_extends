public class Hawk extends Bird {

    Animal prey;

    public Hawk() { }

    public Hawk(String specie, int age, int weight) {
        super.specie = specie;
        super.age = age;
        super.weight = weight;
    }

    public Animal getPrey() {
        return prey;
    }

    public void setPrey(Animal prey) {
        this.prey = prey;
    }

    public void predate() {
        System.out.println("感到饥肠辘辘并且捕食了一只" + prey.specie);
    }

}
