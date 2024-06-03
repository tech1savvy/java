import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        String str = "abcdabcaba";
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        
        char[] arr = str.toCharArray();
        int count;
        String find;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                count = map.get(arr[i]);
                map.put(arr[i],++count);
            }else{
                map.put(arr[i],1);
            }
        }

        Set<Character> keys = map.keySet();
        for(char key: keys){
            System.out.println(key + ": " + map.get(key));
        }
    }
}