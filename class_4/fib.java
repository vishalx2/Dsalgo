// import java.util.Scanner;
// class fib{
//     public static void main(String[] args){
//        System.out.print("enter a number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        
//        int a=0;
//        int b=1;
//        while(n-->=0)
//        {
//            System.out.println(a);
//            int temp = a+b;
//            a=b;
//            b=temp;
//        }
        
//     }
// }

import java.util.Scanner;
class fib{
    public static void main(String[] args){
        System.out.print("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        while(n-->=0 )
        {
            System.out.println(a);
            int temp = a+b;
            a=b;
            b =temp;
        }
    }
}













