package animal;

public class Animal {
    private String name;
    private int age;

    //エラー回避のため引数なしを定義
    public Animal() {
    }

    //コントラクタを用意
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }
}
