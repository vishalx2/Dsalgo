class hollow{
    public static void main(String[] args){
        int n = 7;
        int nsp = -1;
        int nst = n/2+1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++)
            {
                System.out.print("* ");
            }
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("  ");
            }
            int j;
            if(i==1 || i==n)
            {j=2;}
            else{j=1;}
            for(;j<=nst;j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
            if(i<=n/2)
            {
                nsp+=2;
                nst--;
            }
            else
            {
                nsp-=2;
                nst++;
            }
        }
    }
}