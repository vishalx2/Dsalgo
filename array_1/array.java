import java.util.Arrays;

public class array{
    public static void main(String[] args) {
        ques();
    }

    static void ques(){
        int[] arr = {7,6,8,3,4,5,2,1,0};
        // reverse(arr);
        // findcount(arr);
        inverse(arr);
    }
    static void reverse(int[] arr){
        int i=0;
        int j = arr.length-1;
        System.out.println(Arrays.toString(arr));
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
       System.out.println(Arrays.toString(arr)); 
    }

    static void findcount(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int idx = arr[i];
            ans[idx]++;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]!=0){
                System.out.println(i+"==>"+ans[i]);
            }
        }
    }

    static void inverse(int[] arr){

        int [] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ans[arr[i]] = i;
        }
        System.out.println(Arrays.toString(ans));

    }
    
}

