import java.util.Scanner;
class triangle{
    public static void main(String[] args){
        System.out.print("enter the number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            // for(int j=1;j<=i;j++){
               
            //   System.out.print("*");
              
            // }
            // System.out.println();

            // for(int j=1;j<=i;j++)
            // {
            //     System.out.print("*");
            
                
            // }
            // System.out.println();
            for(int j=1;j<=i;j++)
            {
            System.out.print(" ");
            }
           
            System.out.println("*");
        }
        
    }
}

