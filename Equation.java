package ex2.work3;

public abstract class Equation 
{
    int a;
    int b;
    int c;
    double x1;
    double x2;
    
    {
        System.out.println("non-static"); // logical block of code (non static)
                                     // is called the first time(!) an instance of a class is accessed
                                     // (it means when creating the object)
    }
    
    static  // logical block of code (static)
            // is called the first time(!) the class is called
    {
        System.out.println("static");
    }
    
    public abstract void print();
    public abstract void solve();
    
    public String toString()
    {
        return "it prints from method Equation.toString " + x1 + " " + x2;
    }
}
