package animal;

public class Human extends Animal implements Thinkable {

    private String hobby;

    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}
