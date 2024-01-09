import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Children children = new Children();

        children.setName("八神太一");
        children.setAge(11);

        System.out.println("Hello " + children.getName());
        System.out.println("年齢は、" + children.getAge() + "歳です");

    }
}

class Children {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
