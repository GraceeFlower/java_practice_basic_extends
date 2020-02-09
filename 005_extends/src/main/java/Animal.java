public class Animal {

    String specie;
    int age;
    int weight;

    public Animal() { }

    public Animal(String specie) {
        this.specie = specie;
    }

    public Animal(String specie, int age, int weight) {
        this.specie = specie;
        this.age = age;
        this.weight = weight;
    }

    public String getAge() {
        return age + "岁";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWeight() {
        return weight + "Kg";
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("饱餐一顿");
    }

    public void sleep() {
        System.out.println("心满意足地睡觉了");
    }
}
