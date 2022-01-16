// // // public class arr1{
    
// // //     public static void main(String[] args){
// // //         que();
// // //     }

// // //     static void que(){
// // //         maxelem();
// // //     }
// // //     static int maxelem(){
// // //         // ?int[] arr = {2,6,8,13,96,8,0,-1};
// // //         int [] arr = {2,1,0,5,3};
// // //          int max = arr[0];
        
// // //          for(int i=0;i<arr.length;i++)
// // //          {
// // //              if(arr[i]>max)
// // //              {
// // //                  max = arr[i];
// // //              }
           
// // //          }
          
// // //         return max;
// // //     }
// // // }

// // public class ques {
    
// //     public static void main(String[] args) {
        
// //         question();
// //     }

// //     static void question(){

// //         // maxelem();
// //         barchart();

// //     }

// //     static void barchart(){

// //         int[] arr={2,8,1,0,5,3};

// //         int maxfloor=maxelem(arr);
// //         // System.out.println(maxfloor);

// //         for(int i=maxfloor;i>=1;i--){

// //             for(int val:arr){//for each 
// //                 if(val>=i){
// //                     System.out.print("* ");
// //                 }else{
// //                     System.out.print("  ");
// //                 }
// //             }

// //             System.out.println();

// //         }

// //     }


// //     static int maxelem(int[] arr){
// //         // your code is here............
// //         int max=arr[0];
// //         for(int i=0;i<arr.length;i++){
// //             if(arr[i]>max){
// //                 max=arr[i];
// //             }
// //         }

// //         return max;

// //     }
// // }


// public class arr1{
//     public static void main(String[] args){
//         question();
//     }
//     static void question(){
//         barchart();
//     }
//     static void barchart(){
//         int [] arr = {2,8,1,0,5,3};
//         int maxfloor = maxelem(arr);
//         for(int i=maxfloor;i>=1;i--){
//             for(int val : arr){
//                 if(val>=i){
//                     System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     static int maxelem(int[] arr){
//         int max = arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
// }

public class arr1{
    public static void main(String[] args){
        question();
    }
    static void question(){
        // barchart();
        reverse();
    }
    static void barchart(){
        int[] arr = {2,3,1,6,8,4};


        int maxfloor = maxelem(arr);
        for(int i=maxfloor;i>=1;i--){
            for(int val : arr)
            if(val>=i){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }

        }
        System.out.println();
    }

static int maxelem(int[] arr){
    int max = arr[0];
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            max = arr[i];
        }

    }
    return max;
}
}

static void reverse(){
    int i = arr[1];
    int j = arr[arr.length-1];
    for(int i=1;i<arr.length;i++)
    {
        i = j;
        i++;
        j--;

    }
    
}







