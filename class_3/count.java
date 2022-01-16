// import java.util.Scanner;
// class count{
//     public static void main(String[] args)
//     {
//     System.out.print("enter the number : ");
//     Scanner sc=new Scanner(System.in);
//     int n = sc.nextInt();
//     int count=0;
    
//     while(n!=0)
//     {
//         n =n/10;
//         count++;
//     }
//     System.out.print(count);

// }
// }

import java.util.Scanner;
class count{
    public static void main(String[] args){
        System.out.print("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copyn = n;
        int count1 =0;
        while(n!=0)
        {
            n /=10;
            count1++;
        }
        int divi = (int)Math.pow(10,count1-1);
        while(divi!=0){
        int r = copyn/divi;
        System.out.println(r);
        copyn%=divi;
        divi/=10;
        }

    }
}






















