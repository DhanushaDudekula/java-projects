package hello;
import java.util.*;

public class ToyAndIceCreamManager {

    public static void main(String[] args) {
        // Stack for toy box
        Stack<String> toyBox = new Stack<>();
        toyBox.push("Ball");
        toyBox.push("Blocks");
        toyBox.push("Puzzle");

        // Pop the top toy
        String playingToy = toyBox.pop();
        System.out.println("Playing with: " + playingToy);

        // Show remaining toys
        System.out.println("Toys left in the toy box: " + toyBox);

        // Queue for ice cream line
        Queue<String> iceCreamLine = new LinkedList<>();
        iceCreamLine.add("Maya");
        iceCreamLine.add("Leo");
        iceCreamLine.add("Nina");

        // Serve the first kid
        String servedKid = iceCreamLine.poll();
        System.out.println("Served ice cream to: " + servedKid);

        // Show who is still in line
        System.out.println("Kids still in line: " + iceCreamLine);
    }
}
