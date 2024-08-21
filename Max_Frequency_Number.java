import java.util.HashMap;
import java.util.Map;

public class Test{
    public static int max(int[] arr){
        HashMap<Integer, Integer>hash_map = new HashMap<>();
        
        for(int n: arr){
            if(hash_map.containsKey(n)){
                hash_map.put(n, hash_map.get(n)+1);
            }
            else{
                hash_map.put(n,1);
            }
        }
        
        int maxfreq=0;
        int maxfreqnum=-1;
        for(Map.Entry<Integer, Integer>entry:hash_map.entrySet()){
            if(entry.getValue() > maxfreq){
                maxfreq = entry.getValue();
                maxfreqnum = entry.getKey();
            }
        }
        return maxfreqnum;
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,2,2,3,1,3,3,3};
        int res = max(arr);
        System.out.println(res);
    }
}
