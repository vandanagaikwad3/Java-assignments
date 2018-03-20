/**
 * 
 */

/**
 * @author vandana
 *
 */
import java.util.ArrayList;

interface  Area
{
double pi=3.14;
double compute(double x,double y);


 
}
class Rect implements Area
{
public double compute(double x,double y)
{
return x*y;
}
}
class Tri implements Area
{
public double compute(double x,double y)
{
return x*y/2;
}
}
class Cir implements Area
{
public double compute(double x,double y)
{
return pi*x*x;
}
}
class InterfaceDemo
{
public static void main(String arg[])
{
Area A;
Double Ans;
Rect r=new Rect();
Tri t=new Tri();
Cir c=new Cir();
A=r;
Ans =A.compute(11,20); 
System.out.println("Area of rectangle"+Ans);
A=t;
Ans =A.compute(11,20); 
System.out.println("Area of Triangle"+Ans);
A=c;
Ans =A.compute(11,20); 
System.out.println("Area of rectangle"+Ans);
}
}