// class printprime{
//     public static void main(String[] args){
//         System.out.print("enter the no : ");
//         Scanner sc = new Scanner(System.in);
        
//         int n = sc.nextInt();
//         boolean flag= true;
//         for(int i=2;i<n;i++)
//         {
//             if(n%i==0)
//             {
                 
//                 flag=!flag;
//                 break;

//             }
//         }
//         if(flag)
//         System.out.println("no. is prime");
//         else
//         System.out.println("no. is not prime");
//     }
// }
import java.util.Scanner;
class printprime{
    public static void main(String[] args)
    {
        System.out.print("enter the number : ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag= true;
        for(int i=2;i<n;i++)
        {
         
        if(n%i==0)
        {
            flag=!flag;
            break;
        }
        }
    if(flag ){
        System.out.println(n+"is prime");
    }    
    else{
        System.out.println(n+"is not prime");
    }
    }
}