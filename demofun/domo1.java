import java.util.Scanner;

public class demofun {
    
    public static void main(String[] args) {
        
        // add();//calling
        // add();//calling
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the two number");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // add_1(a, b);//actual parameter
        // sub_1(a, b);
        // mul_1(a, b);

        // int ans=add_2();
        // System.out.println(ans);

        int a=12;
        int b=3;

        int ans=mul_2(a, b);
        System.out.println(ans);

    }

    static int mul_2(int x,int y){// 1 ,1 
        return x*y;
    }

    static int add_2(){// 1,0
        int a=3;
        int b=15;

        return a+b;
    }

    // formal parameter
    static void add_1(int num1,int num2){//function define ==> 0 1 
        System.out.println(num1+num2);
        // return;
    }
    static void sub_1(int a,int b){//function define ==> 0 1 
        System.out.println(a-b);
        // return;
    }
    static void mul_1(int a,int b){//function define ==> 0 1 
        System.out.println(a*b);
        // return;
    }

    static void add(){//function define ==> 0 0

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
        // return;
    }
}



import java.util.Scanner;

public class demofun {
    
    public static void main(String[] args) {
        
        // add();//calling
        // add();//calling
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the two number");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // add_1(a, b);//actual parameter
        // sub_1(a, b);
        // mul_1(a, b);

        // int ans=add_2();
        // System.out.println(ans);

        int a=12;
        int b=3;

        int ans=mul_2(a, b);
        System.out.println(ans);

    }

    static int mul_2(int x,int y){// 1 ,1 
        return x*y;
    }

    static int add_2(){// 1,0
        int a=3;
        int b=15;

        return a+b;
    }

    // formal parameter
    static void add_1(int num1,int num2){//function define ==> 0 1 
        System.out.println(num1+num2);
        // return;
    }
    static void sub_1(int a,int b){//function define ==> 0 1 
        System.out.println(a-b);
        // return;
    }
    static void mul_1(int a,int b){//function define ==> 0 1 
        System.out.println(a*b);
        // return;
    }

    static void add(){//function define ==> 0 0

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a+b);
        // return;
    }
}