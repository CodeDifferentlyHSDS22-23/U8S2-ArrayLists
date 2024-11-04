package partB.ex01;

import java.util.ArrayList;

public class ArrayListDemoExample {

    public static String arrayListDemoExample() {
        String response = "";

        ArrayList<String> names;
        names = new ArrayList();

        names.add("Jamie");
        names.add("Gustav");
        names.add("Alisa");
        names.add("Jose");
        names.add(2, "Prashant");

        String str = names.get(0);
        response += (str);

        names.remove(0);
        names.remove(names.size() - 1);
        names.remove("Gustav");

        response += (names);


        return response;

    }


    public static void main(String args[]) {
        String output = arrayListDemoExample();
        System.out.print(output);
    }
}
