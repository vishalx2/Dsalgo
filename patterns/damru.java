class damru{
    public static void main(String[] args){
        int n = 7;
        int nsp = 0;
        int nst = n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
            if(i==n/2+1)
            {
                System.out.print("* ");
            }
            else
            {
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            if(i<=n/2)
            {
                nsp++;
                nst-=2;
            }
            else{
                nsp--;
                nst+=2;
            }
        }
    }
}