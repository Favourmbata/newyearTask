package tasks;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int age;
    private String name;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static List<User> createUsers(List<String> names) {
        List<User> users = new ArrayList<>();
        for (String name : names) {
            int age = name.length();
            users.add(new User(name, age));
        }
        return users;
    }

    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        List<User> users = createUsers(names);

        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
}

