import java.util.*;
class Overload
{
void printfn()
{
System.out.println("null arguments");
}
void printfn(int a)
{

System.out.println("the value of a is= "+a);
}
void printfn(float b)
{
System.out.println("the value of b is= "+b);
}
}
class Mindddd
{
public static void main(String args[])
{   
int p=5;
float z=3.56f;
Overload obj= new Overload();
obj.printfn();
obj.printfn(p);
obj.printfn(z);
}
}