import java.util.Stack;

public class stack {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        stack.add("abid");
        stack.add("ahnaf");
        stack.add("inayet");
        stack.add("akif");
        Stack<Integer> sk = new Stack<Integer>();
        sk.add(2);
        sk.add(5);
        sk.add(6);
        sk.add(7);
        System.out.println(stack.get(3)+"\t"+sk.get(3));
        for(int r=0;r<1;r++) {
            for (int m = 0; m < sk.size(); m++) {
                System.out.println(m+" "+stack.get(m)+" "+sk.get(m));
            }


        }
    }

}


