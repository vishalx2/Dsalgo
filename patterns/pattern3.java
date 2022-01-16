class pattern3{
    public static void main(String[] args){
        int n=15;
        int nsp = n/2;
        int nst = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("  ");

            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print(i );
            }
            System.out.println();
            if(i<=n/2)
            {
                nsp--;
                nst+=2;
            }
            else
            {
                nsp++;
                nst-=2;
            }
        }
    }
}