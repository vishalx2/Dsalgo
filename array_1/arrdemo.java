// import java.util.Scanner;
// class arrdemo{
//     public static void main(String[] args){
//         System.out.print("enter the number :");
//         Scanner sc = new Scanner(System.in);
//         int sz = sc.nextInt();
//         int [] arr = new int[sz];
//         for(int i=0;i<arr.length;i++)
//         {
//            arr[i] = sc.nextInt();
            
//         }
//         display(arr);
        
//     }
//     static void display(int[] drr){
//         System.out.print("[");
//         for(int i=0;i<drr.length;i++){
//             System.out.print(drr[i] + ", ");
//         }
//         System.out.print("]");
//     }
// }

// import java.util.Scanner;
// class arrdemo{
//     public static void main(String[] args){
//         System.out.print("enter the number : ");
//         Scanner sc = new Scanner (System.in);
//         int sz = sc.nextInt();
//         int[] arr = new int[sz];
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i] = sc.nextInt();
//         }
//         display(arr);
//     }
//     static void display(int[] drr){
//         System.out.print("[");
//         for(int i=0;i<drr.length;i++){
//             System.out.print(drr[i]+ ", ");
//         }
//         System.out.print("]");
//     }
// }
import java.util.Scanner;
class arrdemo{
    public static void main(String[] args){
       System.out.print("enter the number : ");
       Scanner sc = new Scanner(System.in);
       int sz = sc.nextInt();
       int [] arr = new int[sz];
       for(int i=0;i<arr.length;i++)
       {
           arr[i] = sc.nextInt();
       }

       display(arr);
      
    }
    static void display(int[] drr){
        System.out.print("[");
        for(int i=0;i<drr.length;i++)
        {
            System.out.print(drr[i]+ ", ");
        }
        System.out.print("]");
    }
}