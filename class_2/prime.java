// // // class prime{
// // //     public static void main(String[] args)
// // //     {
// // //         boolean flag= true;
// // //         for(int i=2;i<n;i++)
// // //         {
// // //         int n=19;
// // //         if(n%i==0)
// // //         {
// // //             flag=!flag;
// // //             break;
// // //         }
// // //         }
// // //     if(flag ){
// // //         System.out.println(n+"is prime");
// // //     }    
// // //     else{
// // //         System.out.println(n+"is not prime");
// // //     }
// // //     }
// // // }
// // class prime{
// //     public static void main(String[] args)
// //     {
// //         int n=21;
// //         boolean flag = true;
// //         int i=2;
// //         while(i*i<=n)
// //         {
// //            if(n%i==0)
// //            {
// //                flag=!flag;
// //                break;
// //            }
// //            i++;
// //         }
// //        if(flag )
// //        {
// //         System.out.println(n+"is prime");
// //        }    
// //        else{
// //         System.out.println(n+"is not prime");
// //        } 

// //     }
// // }
// import java.util.Scanner;
// class prime{
//     public static void main(String[] args){
//         System.out.print("Enter the number ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
         
//         boolean flag = true;
//         for(int i=2;i*i<=n;i++)
//         {
//         if(n%i==0)
//         {
//         flag=!flag;
//         break;
//         }
//         }
//         if(flag)
//         System.out.println("prime");
//         else
//         System.out.println("not prime");

//         }
     
// }

import java.util.Scanner;
class prime{
    public static void main(String[] args){
        System.out.print("Enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
         
        for(int i=2;i<=n;i++)
        {
            boolean flag = true;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
                {
                flag=!flag;
                break;
                }
                 
            }
            if(flag)
            System.out.println(i);
        }
        
    }
}























