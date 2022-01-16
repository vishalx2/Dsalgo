// class oddEven1{
//     public static void main(String[] args){
//         int n =10;
//         if(n%2==0)
//         {
//             System.out.println("even");
//         }
//         else
//         {
//             System.out.println("odd");
//         }
//         if(n%2==0)
//         {
//             System.out.println(n+"is divisible by 2");
//         }
//          else if(n%3==0)
//         {
//             System.out.println(n+"is divisible by 3");
//         }
//          else
//         {
//             System.out.println(n+"is divisible by 5");
//         }

//     }

// }
import java.util.Scanner;
class oddEven1{
    public static void main(String[] args)
    {
    System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n%2==0)
    System.out.println(n+" Even");
    else
    System.out.println(n+" Odd");
    if(n%2==0)
    System.out.println(n+" is divi by 2");
     if(n%3==0)
    System.out.println(n+" is divi by 3");
    if(n%5==0)
    System.out.println(n+" is divi by 5");
    }

}


















