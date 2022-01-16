// // class oddEven{
// //     public static void main(String[] args)
// //     {
// //         int n=28;
// //         if(n%2==0)
// //         {
// //             System.out.println("EVEN");
// //         }
// //         else
// //         {
// //             System.out.print("ODD");
// //         }

// //     }
// //  }

// class table{
//     public static void main(String[] args)
//     {
//        int n = 9;
//        for(int i=1;i<=n/2;i++)
//        {
//            if(n%i==0)
//            {
//                if(i<=2)
//                {
//                    System.out.println("prime");
//                }
//                else
//                {
//                  System.out.println("not prime");  
//                }
//            }
//        }
//     }
// }

import java.util.Scanner;
class table{
    public static void main(String[] args)
    {
    System.out.print("enter the number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=10;i++)
    {
    System.out.println(n*i);
    }
    
    }

}


















