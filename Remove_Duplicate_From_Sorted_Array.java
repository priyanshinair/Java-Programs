//remove dulicates from sorted array
public class Test{
    public static int find(int[] arr){
        int n = 0;
        int size = arr.length;
        for(int i =1;i<size;i++){
            if(arr[n]!=arr[i]){
                n++;
                arr[n] = arr[i];
            }
        }
        return n+1;
    }
    
    public static void main(String[] args){
        int[] arr = {1,1,2,2,2,3};
        int new_length = find(arr);
        
        for(int i =0;i<new_length;i++){
            System.out.println(arr[i]);
        }
    }
}
