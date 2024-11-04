package partB.ex03;

import java.util.ArrayList;

public class ArrayListTraversingExample {

    public static String traversingExample() {
        String response = "";

        ArrayList<String> names = new ArrayList<String>();
        names.add("Tom");
        names.add("Mike");
        names.add("Matt");
        names.add("Nick");

        response += ("");
        for (String i : names) {
            response += ("Name is "+i);
        }

        return response;

    }
    public static void main(String[] args) {
        String output = traversingExample();
        System.out.print(output);


    }
}
