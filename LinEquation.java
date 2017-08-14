package ex2.work3;

public class LinEquation extends Equation
{
    public LinEquation(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    @Override
    public void solve()
    {
        x1 = -b/a;        
    }
    
    
    @Override
    public void print()
    {
        System.out.println(x1);
    }
}
