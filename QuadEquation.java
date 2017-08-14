package ex2.work3;

public class QuadEquation extends Equation
{  
    @Override   
    public void print()
    {
        System.out.println(x1 +"\n" + x2);
    }
    
    @Override
    public void solve()
    {
        x1 = (-b + Math.pow((b * b - 4 * a * c), 0.5)) / (2*a);
        x2 = (-b - Math.pow((b * b - 4 * a * c), 0.5)) / (2*a);
    }            
    
    public QuadEquation(int a, int b, int c)
    {
        this.a = a;    
        this.b = b; 
        this.c = c; 
    }       
}
