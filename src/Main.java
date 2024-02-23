import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Integer grade = 1;
        Child child = new Child();
        Map<String, Integer> children = new HashMap<>();
        Map<Integer, String> grades = new HashMap<>();

        child.setFullName("八神太一");
        child.setAge(11);
        children.put(child.getFullName(), child.getAge());

        child.setFullName("泉光子郎");
        child.setAge(10);
        children.put(child.getFullName(), child.getAge());

        child.setFullName("城戸丈");
        child.setAge(12);
        children.put(child.getFullName(), child.getAge());

        child.setFullName("高石タケル");
        child.setAge(8);
        children.put(child.getFullName(), child.getAge());

        for (int i = 7; i <= 12; i++) {
            grades.put(i, "小学" + grade + "年生です");
            grade++;
        }

        for (String childName : children.keySet()) {
            System.out.println(childName + "は、" + children.get(childName) + "歳です");
            Integer age = children.get(childName);
            if (age == 7) {
                System.out.println(grades.get(age));
            } else if (age == 8) {
                System.out.println(grades.get(age));
            } else if (age == 9) {
                System.out.println(grades.get(age));
            } else if (age == 10) {
                System.out.println(grades.get(age));
            } else if (age == 11) {
                System.out.println(grades.get(age));
            } else if (age == 12) {
                System.out.println(grades.get(age));
            } else {
                System.out.println("学年は不明です");
            }
        }

    }
}





