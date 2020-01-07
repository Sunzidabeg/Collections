import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Nipa");

        list.add("Vijay");
        list.add("Papia");
        list.add("Ravi");
        list.add("Papia");
        list.add("Ravi");
        list.add("Ajay");
        list.add("Nipa");


        for(String s:list)
            System.out.println(s);
    }

}

