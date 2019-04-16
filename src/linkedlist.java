import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("aminur");
        linkedlist.add("siddik");
        linkedlist.add("shamsu");
        linkedlist.add("mujib");
        linkedlist.add("imran");
        System.out.println(linkedlist.size());
        System.out.println(linkedlist.get(0) + "\t" + linkedlist.get(1));
        LinkedList<Integer> linkedlist1 = new LinkedList<Integer>();
        linkedlist1.add(10);
        linkedlist1.add(12);
        linkedlist1.add(15);
        linkedlist1.add(17);
        linkedlist1.add(20);
        System.out.println(linkedlist1.get(1) + "\t" + linkedlist1.get(2));
        for (int e = 0; e < 1; e++) {

            for (int k = 0; k < linkedlist.size(); k++) {
                System.out.println(k + " " + linkedlist.get(k) + " " + linkedlist1.get(k));
            }
        }
    }
}
