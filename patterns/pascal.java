// class pascal{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=0;i<n;i++)
//         {
//             int var=1;
//             for(int j=0;j<=i;j++)
//             {
//                 System.out.print(var+"\t");
//                 var = (var*(i-j))/(j+1);
//             }
//             System.out.println();
//         }
//     }
// }

class pascal{
    public static void main(String[] args){
        int n=5;
        for(int i=0;i<n;i++)
        {
            int var = 1;
            for(int j=0;j<=i;j++)
            {
                System.out.print(var+"\t");
                var = (var*(i-j))/(j+1);
            }
            System.out.println();
        }
    }
}