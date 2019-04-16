public class Array {

    public static void main(String[] args) {


        String employeesName[] = {"Apu", "Adnan", "Khan", "Gulam", "Modu"};
        int salary[] = {1000, 1500, 1700, 900, 800};
        // System.out.println(salary.length);
        // System.out.println(salary[2]+" "+employeesName[2]);
        // for(int a=0;a<5;a++){

        //  System.out.println(a+" "+employeesName[a]);
        //System.out.println(a+" "+salary[a]);
        for (int b = 0; b < salary.length; b++)


            System.out.println(b + "\t" + employeesName[b] + "\t" + salary[b]);
    }


}
