class p1{
    public static void main(String[] args){
        int n = 7;
        int nsp =0;
        int nst = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=nst;j++)
            if(i>1 && i<=n/2 && j>1 && j<nst)
            {
                System.out.print("  ");
            }
            else
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