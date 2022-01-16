import java.util.Scanner;
class lcm{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tn = n;
        int tm = m;
        if(n>m){
            int temp = n%m;
            n= m;
            m = temp;
        }
        int gcd = m;
        int lcm1 = (tn*tm)/gcd;
        System.out.println("gcd"+gcd);
        System.out.print("lcm"+lcm1);
    }
}