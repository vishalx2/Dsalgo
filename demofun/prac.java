
// import java.util.Scanner;
// public class prac{
//     public static void main(String[] args){
//         int a = 12;
//         int b = 3;
//         int ans = mul_2(a,b);
//         System.out.println(ans);
//     }

//     static int mul_2(int x,int y){
//         return x*y;
//     }

//     static int add_2(){
//         int a = 3;
//         int b = 15;
//         return a+b;
//     }

//     static void add_1(int num1,int num2){
//         System.out.println(num1+num2);

//     }
//     static void sub_1(int a,int b){
//         System.out.println(a-b);
//     }
//     static void mul_1(int a , int b){
//         System.out.println(a*b);
//     }
//     static void add(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(a+b);
//     }
// }

// class prac{
//     public static void main(String[] args){
//         int num = 21;
//         int b = 2;
//         System.out.println(DtoAB(num,b));
//     }
//     static int DtoAB(int num, int b){
//         int ans = 0;
//         int p=1;
//         while(num!=0)
//         {
//             int r = num%b;
//             num = num/b;
//             ans = r*p+ans;
//             p = p*10;
//         }
//         return ans;
//     }
// }

//    class prac{
//        public static void main(String[] args){
//            int num = 10101;
//            int b = 2;
//            System.out.println(BtoD(num,b));
//        }
//        static int BtoD(int num,int b){
//            int ans =0 ;
//            int m = 1;
//            while(num!=0){
//                int r = num%10;
//                num = num/10;
//                ans = ans+ m*r;
//                m = m*2;
//            }
//            return ans;
//        }
//    }


class prac{
    public static void main(String[] args){
        int n= 1234;
        int b1 = 7;
        int b2 = 10;
        System.out.println(AtoA(n,b1,b2));
    }

    public static int AtoA(int n ,int b1,int b2){
        int atod = anybasetodecimal(n,b1);
        int dtoa = decimaltoanybase(atod,b2);
        return dtoa;
    }
 
   static int decimaltoanybase(int n,int b){
       int ans =0;
       int p=1;
       while(n!=0){
           int dig = n%b;
           n = n/b;
           ans = ans+dig*p;
           p=p*10;
       }
       return ans;
    }
    public static int anybasetodecimal(int n,int b){
        int ans =0 ;
        int p=1;
        while(n!=0){
          int dig = n%10;
          n = n/10;
          ans = ans+dig*p;
          p = p*b;

        }
        return ans;
    } 
}





