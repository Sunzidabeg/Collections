import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        hm.put(null,"jjj");
        hm.put(null,"Ravi");
        hm.put(null,"Vijay");
        hm.put(null,"gfgffgg");


        for(Map.Entry pp:hm.entrySet()){
            System.out.println(pp.getKey()+" "+pp.getValue());

           // System.out.println(pp.getKey());
            //System.out.println(pp.getValue());
        }
    }
}
