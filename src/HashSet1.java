import java.util.HashSet;

public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> list=new HashSet();


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
