public class Animal {

    int age;
    int weight;

    public Animal() { }

    public Animal(int age, int weight) {
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
        return weight + "kg";
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Eat food!");
    }

    public void sleep() {
        System.out.println("Sleep!");
    }
}
