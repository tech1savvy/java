public class TypeCasting {
    public static void main(String[] args){
        char c1 = 'a';
        char c2 = 'm';
        char c3 = 'a';
        char c4 = 'n';
        System.out.println((char)((char)(c1-32)+(char)(c2-32)+(char)(c3-32)+(char)(c4-32)));
    }
}
