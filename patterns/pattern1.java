class pattern1{
    public static void main(String[] args){
        int n=5;
        int nsp = n-1;
        int st = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=st;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            st++;
        }
        
    }
}