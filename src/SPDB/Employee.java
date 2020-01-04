package SPDB;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amie on 2019/8/5.
 */
public class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("张三", 25);
        Employee employee1 = new Employee("李四", 35);
        Employee employee2 = new Employee("王五", 30);
        Map<Object, Object> m1 = new HashMap<>();
        m1.put(1, employee1);
        m1.put("2", employee);
        m1.put(null,employee2);
        System.out.println(m1);
        System.out.println(m1.size());
        System.out.println(m1.get(null));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
