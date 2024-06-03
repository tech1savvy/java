public class PrintDiff {
    public static void main(String[] args){
        computeDiff(args);
    }
    public static void computeDiff(String[] args){
        int firstNo = Integer.parseInt(args[0]);
        int secondNo = Integer.parseInt(args[1]);

        int diff = firstNo - secondNo;
        if(-25<diff && diff<25){
            System.out.println(diff*diff);
        }else{
         System.out.println(diff);
        }
    }
}
