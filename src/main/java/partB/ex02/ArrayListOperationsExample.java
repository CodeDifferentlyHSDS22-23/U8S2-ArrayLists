package partB.ex02;

import java.util.ArrayList;

public class ArrayListOperationsExample {

    public static String arrayListOperationsExample() {
        String response = "";

        ArrayList<String> currency = new ArrayList<String>();
        currency.add("Dollar");
        currency.add("Pound");
        currency.add("Euro");
        currency.add("Peso");
        currency.add("Dhiram");
        currency.add(3, "Rupee");
        if (currency.contains("Rupee")) {
            response += (" Currency is present");
        } else {
            response += (" Currency is not present");
        }
        currency.remove("Rupee");
        response += ("The following currency are present");
        for(String i:currency)
        {
            response += (i);
        }

        return response;

    }
    public static void main(String[] args) {
        String output = arrayListOperationsExample();
        System.out.print(output);

    }
}
