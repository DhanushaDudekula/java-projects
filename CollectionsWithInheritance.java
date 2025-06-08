package hello;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

class Person {
    String name;
    int age;

    Person(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

class Employee extends Person {
    String department;

    Employee(String employeeName, int employeeAge, String employeeDepartment) {
        super(employeeName, employeeAge);
        department = employeeDepartment;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", department='" + department + "'}";
    }
}

public class CollectionsWithInheritance {
    public static void main(String[] args) {
        Employee e1 = new Employee("redu", 20, "HR");
        Employee e2 = new Employee("harsha", 19, "IT");
        Employee e3 = new Employee("shiva", 22, "Finance");

        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(e1);
        arrayList.add(e2);
        System.out.println("ArrayList: " + arrayList);

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.add(e2);
        linkedList.add(e3);
        System.out.println("LinkedList: " + linkedList);

        HashSet<Employee> hashSet = new HashSet<Employee>();
        hashSet.add(e1);
        hashSet.add(e3);
        hashSet.add(e1);
        System.out.println("HashSet: " + hashSet);

        HashMap<Integer, Employee> hashMap = new HashMap<>();
        hashMap.put(1, e1);
        hashMap.put(2, e2);
        hashMap.put(3, e3);
        System.out.println("HashMap:");
        for (Map.Entry<Integer, Employee> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
