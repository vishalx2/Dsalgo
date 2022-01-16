// class diamond{
//     public static void main(String[] args){
//         int n = 7;
//         int nsp = n/2;
//         int nst = 1;
         
//         int var=1;
//         for(int i=1;i<=n;i++)
//         {
            
//             for(int j=1;j<=nsp;j++)
//             {
//             System.out.print("  ");
//             }
//             int temp = var;
//             for(int j=1;j<=nst;j++)
//             {
//                 System.out.print(temp+" ");
//                 if(j<=nst/2){
//                     temp++;

//                 }
//                 else{
//                     temp--;
//                 }
//              }
//             System.out.println();
//             if(i<=n/2)
//             {
//                 nsp--;
//                 nst+=2;
//                 var++;
//             }
//             else
//             {
//                 nsp++;
//                 nst-=2;
//                 var--;
//             }
//         }
//     }
// }

class diamond{
    public static void main(String[] args){
        int n=7;
        int nsp = n/2;
        int nst = 1;
        int var =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("  ");
            }
            int cvar = var;
            for(int j=1;j<=nst;j++)
            {
                System.out.print(cvar+" ");
                if(j<=nst/2)
                {
                    cvar++;
                }
                else{
                    cvar--;
                }
            }
            
            System.out.println();
            if(i<=n/2)
            {
                nsp--;
                nst+=2;
                var++;
            }
            else{
                nsp++;
                nst-=2;
                var--;
            }
            
        }
    }
}