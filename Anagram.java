//anagram string
import java.util.Arrays;

public class Test{
    public static boolean anagram(String str1, String str2){
        int n = str1.length;
        int m = str1.length;
        char[] arr1 = new[n];
        char[] arr2 = new[m];
        
        for(int i=0;i<str1.length;i++){
            arr1 = str1.chatAt(i);
        }
        
        for(int i=0;i<str2.length;i++){
            arr2 = str2.chatAt(i);
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int j=0;
        for(int i=0;i<str1.length;i++){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        String str1 = "priya";
        String str2 = "riyap";
        
        boolean res = anagram(str1, str2);
        System.out.println(res);
    }
}
