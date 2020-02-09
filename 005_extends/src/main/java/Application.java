public class Application {
    /**
     * 运用之前写的类在Application中用代码描述一下场景：
     * 一只4岁的老鹰，体重5Kg，这只老鹰生活在兔子窝所以它只捕食兔子。
     * 某天它先翱翔天空，在饥肠辘辘之际捕食了一只兔子，然后饱餐一顿，
     * 心满意足之后就睡觉了。
     */
    public static void main(String[] args) {

        Animal rabbit = new Animal("兔子");
        Hawk hawk = new Hawk("老鹰", 4, 5);
        hawk.setPrey(rabbit);

        System.out.println("一只" + hawk.getAge() + "的" + hawk.specie + "，体重" + hawk.getWeight());
        System.out.println("这只" + hawk.specie + "生活在" + rabbit.specie + "窝所以它只捕食" + rabbit.specie);
        System.out.print("某天它先");
        hawk.fly();
        hawk.predate();
        System.out.print("然后");
        hawk.eat();
        hawk.sleep();
    }
}
