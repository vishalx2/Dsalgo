class printDigit{
    public static void main(String[] args){
        System.out.print("enter the no :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count=0;
        while(n!=0)
        {
            n/=10;
            count++;
        }
        int div = (int)Math.pow(10,connt-1);
        
        while(temp!=0)
        {
            temp = temp%10;
            System.out.print(n);
        }
        n = n/div;

    }
    
}