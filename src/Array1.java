public class Array1 {

    public static void main(String[] args) {



        /*int a[]=new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        */
        String name[] = new String[4];
        name[0] = "Papia";
        name[1] = "Nipa";
        name[2] = "Alam";
        name[3] = "Papia1";

        System.out.println(name[1]); // for one value print


        System.out.println("*****************************************************");
       /* for(int i=0;i<4;i++)
            System.out.println(name[i]);
            }
        */
        for (String p : name)
            System.out.println(p);

        /*
        for(int i=0;i<name.length;i++)
            System.out.println(name[i]);

    }
  }  */
    }
}
