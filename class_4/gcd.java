class gcd{
    public static void main(String[] args)
    {
        int a=30;
        int b=40;
        int ta=30;
        int tb=40;
        while(b%a!=0 ){
            int r=b%a;
            b=a;
            a=r; 
        }
        int gcd = a;
        int lcm = (ta*tb)/gcd;
        System.out.println("GCD "+gcd);
        System.out.println("LCM "+lcm);
    }
}