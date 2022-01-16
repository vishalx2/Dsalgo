class dia{
    public static void main(String[] args){
        int n=7;
        int nsp = n/2;
        int nst = 1;
        int count = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(count+" ");
                count++;
            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=nsp;j++)
            {
                System.out.print(count+1 +" ");
                count++;
            }
            System.out.println();
            if(i<=n/2)
            {
                nsp--;
                nst+=2;
            }
             
        }
    }
}