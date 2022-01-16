class patternHOLLOW{
    public static void main(String[] args){
        int n=7;
        int isp = -1;
        int osp = n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=osp;j++)
            {
                System.out.print("  ");
            }
            System.out.print("* ");
            for(int j=1;j<=isp;j++)
            {
                System.out.print("  ");
            }
            if(i>1 && i<n)
            {
                System.out.print("* ");
            }
            System.out.println();
            if(i<=n/2)
            {
                isp+=2;
                osp--;
            }
            else{
                isp-=2;
                osp++;
            }
        }
    }
}