
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("Amin");
        arraylist.add("Rahman");
        arraylist.add("Ahnaf");
        arraylist.add("Abid");
        arraylist.add("Akif");
        arraylist.add("Inayet");
        arraylist.add("Sanjida");

        System.out.println(arraylist.size());

        System.out.println(arraylist.get(4)+"\t"+arraylist.get(5)+"\t"+arraylist.get(6));
        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        arraylist1.add(1000);
        arraylist1.add(2000);
        arraylist1.add(3000);
        arraylist1.add(4000);
        arraylist1.add(5000);
        arraylist1.add(5001);
        arraylist1.add(5011);

        System.out.println(arraylist1.size());
        for(int c=0;c<1;c++){
            for (int d =0;d<arraylist.size();d++) {
                System.out.println(d+" "+arraylist.get(d)+" "+arraylist1.get(d));
            }
        }
    }
}
