// public class number{

//     public static void main(String[] args){
//         int num = 21;
//         int b = 7;
//         System.out.println(DtoAB(num,b));
//     }

//     static int DtoAB(int num,int b){
//         int ans = 0;
//         int p=1;
//         while(num!=0){
//             int r = num%b;
//             num/=b;
//             ans = r*p+ans;
//             p*=10;
//         }
//         return ans;
//     }

// }
public class number{

    public static void main(String[] args){
        int num = 10101;
        int b = 2;
        System.out.println(DtoAB(num,b));
    }

    static int DtoAB(int num,int b){
        
        int p=2;
        while(num!=0){
            int r = num%b;
            num/=b;
            ans = r*p+ans;
            p=10;
        }
        return ans;
    }

}