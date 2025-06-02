package hello;

import java.util.HashMap;


public class HashMapManipulating {
    public static void main(String[] args) {
        // Create a HashMap with roll number (Integer) as key and student name (String) as value
        HashMap<Integer, String> students = new HashMap<Integer,String>();

        // Add 5 students: roll number -> name
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "Teja");
        students.put(105, "Sarayu");
        System.out.println(students);
        students.remove(103);
  System.out.println("after removal of roll number 103:"+students);
       

          // ✅ 1. Update student name for roll number 105
          students.put(105, "Kiran"); // Updates "Sarayu" to "Kiran"
          System.out.println("After update (roll no 105 renamed): " + students);

          // ✅ 2. Check if a key or value exists
          int checkKey = 102;
          String checkValue = "Charlie";

          if (students.containsKey(checkKey)) {
              System.out.println("Key " + checkKey + " exists.");
          } else {
              System.out.println("Key " + checkKey + " does not exist.");
          }

          if (students.containsValue(checkValue)) {
              System.out.println("Value \"" + checkValue + "\" exists.");
          } else {
              System.out.println("Value \"" + checkValue + "\" does not exist.");
          }

          // ✅ 3. Print all keys
          System.out.println("All Keys:");
          for (Integer key : students.keySet()) {
              System.out.println(key);
          }

          // ✅ Print all values
          System.out.println("All Values:");
          for (String value : students.values()) {
              System.out.println(value);
          }

          // ✅ Print all key-value pairs
          System.out.println("All Key-Value Pairs:");
          for (Integer key : students.keySet()) {
              System.out.println("Roll Number: " + key + ", Name: " + students.get(key));
          }
      }
  }
    
    
    
    
    
    
    
    
    
    

