public class Employee {
    /*
    wap to calculate the raw salary of an employee and print that salary. assume
    that you have three commandline arguments that are basic salary da, and hr, and
    taking the name of the class employee
     */
    public static void main(String[] args){
        int base = Integer.parseInt(args[0]);
        int da = Integer.parseInt(args[1]);

        int hr = Integer.parseInt(args[2]);
        System.out.println("Total Salary: " + (base+da+hr));
    }
}
