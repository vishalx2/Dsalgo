public class ques{
    public static void main(String[] args){
        question();
    }
    static void question(){
        
        barchart();
    }
    static void barchart(){
        int [] arr = {2,8,1,0,5,3};
        int maxfloor = maxelem(arr);
        for(int i=maxfloor;i>=1;i--){
            for(int val : arr){
                if(val>=i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    static int maxelem(int arr[] arr){
        
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;

    }

}