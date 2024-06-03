public class CountDemo {
    public static void main(String[] args){
        int passCount = 0;
        for (int i=0; i<4; i++){
            if (Integer.parseInt(args[i])>=50)
                passCount++;
        }
        System.out.println(passCount);
    }
}
