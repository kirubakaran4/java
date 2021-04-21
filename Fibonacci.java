//Fibonacci using recursion


public class Fibonacci1{ 

     int fib(int n) 

    { 

        if (n <= 1) 

            return n; 

        return fib(n - 1)  + fib(n - 2); 

    } 

    void fib()
    {
        int N = 10;
       
        for (int i = 1; i <= N; i++) { 
        System.out.print(fib(i) + " "); 

        } 

    
    }
    public static void main(String args[]) 

    { 
        Fibonacci1 f= new Fibonacci1();
        f.fib();
}
    
}



//Fibonacci without recursion  


public class Fibonacci2{
   public static void main(String args[]) {
       int n1 = 0, n2 = 1, n3, i, max = 10;
       System.out.print(n1 + " " + n2);
       for (i = 2; i < max; ++i) {
          n3 = n1 + n2;
          System.out.print(" " + n3);
          n1 = n2;
          n2 = n3;
       }
    }
 }
