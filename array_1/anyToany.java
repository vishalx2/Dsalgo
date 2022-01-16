class anyToany{
    public static int get value(int n,int b1,int b2){
        int atod = anybasetodecimal(n,b1);
        int dtoa = decimaltoanybase(atod,b2);
        return dtoa;
    }
    public static int decimaltoanybase(int n,int b){
        int ans =0;
        int p=1;
        while(n!=0){
            int dig = n%b;
            n = n/b;
            ans = ans+dig*p;
            p = p*10;
        }
        return ans;
    }
    public static int anybasetodecimal(int n , int b){
        int ans = 0;
        int p=1;
        while(n!=0){
            int dig = n%10;
            n = n/10;
            ans = ans+dig*p;
            p = p*b;
        }
        return ans;
    }
}