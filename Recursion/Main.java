

class Main{

    //print the numer from 5 to 1;
    public static void printNumb(int n){
        if(n==0){
            return;//Base
        }
        System.out.print(n+" ");//work
        printNumb(n-1);//recursion
        
    }

    //print the number form 1 to 5
    public static void printNumb2(int n){
        if(n==6){
            return;  //Base case
        }
        System.out.print(n+" "); //Work
        printNumb2(n+1); //recursion
    }

    //print sum of n natural number
    public static void sumNatural(int i,int n,int sum){
        
        if(i>n){
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumNatural(i+1,n,sum);
        
    }

    //printing the factorial of number n
    public static int fact(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact_nm1=fact(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
    public static int fact2(int n){
        if(n==0||n==1){
            return 1;//base case 
        }
        return n*fact2(n-1);
    }

    //print the fibonacci sequence till Nth term
    public static void fibo(int a,int b,int n){
        if(n==0){return;}
        int c=a+b;
        System.out.print(c+" ");
        fibo(b, c, n-1);
    }

    //print x^n (stach height=n)
    public static int calcPower(int x,int n){
        // if(n==1){return 1;}
        if(n==0){return 1;}
        return x*calcPower(x, n-1);
    }

    //print x^n (stack height= log n)
    public static int calcPower2(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return calcPower2(x, n/2)*calcPower2(x, n/2);
        }else{
            return x*calcPower2(x, n/2)*calcPower2(x, n/2);
        }
    }
    public static void main(String[]args){
        printNumb(10);
        System.out.println("");
        printNumb2(1);
        System.out.println("");
        sumNatural(1, 5, 0);
        System.out.println("");
        int fac=fact(5);
        System.out.println(fac);
        int a=0,b=1;
        System.out.println(a+" ");
        System.out.println(b+" ");
        fibo(a, b, 10);
        System.out.println("");
        int calcpo=calcPower(2, 5);
        System.out.println(calcpo);
        int calcpo2=calcPower2(2, 5);
        System.out.println(calcpo2);
    }
}