import java.util.Scanner;
class reve{
    public static void main(String[] args){
        System.out.print("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0)
        {
            int r = n%10 ;
            System.out.print(r);
            n=n/10;
           
        }
    }
}