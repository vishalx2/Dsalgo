//  class pratice{
//      public static void main(String[] args){
//          int n =7;
//          int nsp = n/2;
//          int nst = 1;
//          for(int i=1;i<=n;i++)
//          {
//              for(int j=1;j<=nsp;j++)
//              {
//                  System.out.print("  ");
//              }
//              for(int j=1;j<=nst;j++)
//              {
//                  System.out.print("* ");
//              }
//              System.out.println();
//              if(i<=n/2)
//              {
//                  nsp--;
//                  nst++;
//              }
//              else
//              {
//                  nsp++;
//                  nst--;
//              }
//          }
       
//      }
//  }

// class pratice{
//      public static void main(String[] args){
//          int n=5;
         
//          char ch='A';
//          for(int i=1;i<=n;i++)
//          {
            
//              for(int j=1;j<=i;j++)
//              {
//                  System.out.print(ch+" ");
//                 ch++;
                 
                
//              }
//              System.out.println();
             
//          }
//      }
// }


// class pratice{
//     public static void main(String[] args){
//         int n=7;
//         int st=1;
//         for(int i=1;i<=n;i++)
//         {
//             for(int j=1;j<=st;j++)
//             {
//                 System.out.print("* ");
                 
//             }
//             System.out.println();
//             if(i<=n/2)
//             {
//                 st++;
//             }
//             else
//             {
//                 st--;
//             }
//         }
//     }
    
// }

class pratice{
    public static void main(String[] args){
        int n = 7;
        int nsp = -1;
        int nst = n;
         
        
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=nsp;j++)
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