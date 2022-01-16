import java.util.Scanner;
class noofDigit{
    public static void main(String[] args){
         

        System.out.print("enter the number : ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int copynum = num;
        int count=0;
        while(num!=0)
        {
            
            num=num/10;
            count++;
        }
        int divpow = (int)Math.pow(10,count-1);
        while(divpow!=0){
            int r = copynum/divpow;
            System.out.println(r);
            copynum%=divpow;
            divpow/=10;
        }
         
    }
}

 