import java.util.ArrayList;

public class arraylist2 {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("monday");
        ar.add("tusday");
        ar.add("wedday");
        ar.add("friday");
        ar.add("satday");

        ArrayList<Integer> kr = new ArrayList<Integer>();
        kr.add(8);
        kr.add(7);
        kr.add(7);
        kr.add(9);
        kr.add(8);
        for (int l=0;l<1;l++){
            for (int h=0;h<ar.size();h++){
                System.out.println(ar.get(h)+" "+kr.get(h));
            }
        }

    }
}
