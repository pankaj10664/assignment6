import java.util.*;
class Animal
{
String breed,colour;
void speak()
{
System.out.println("this is animal class");
}
}
class Dog extends Animal
{
void speak()
{
System.out.println("this is dog class");
}
}
class Cat

{
void speak()
{
System.out.println("this is cat class");
}
}

class Man
{
public static void main(String args[])
{
Cat c=new Cat();
Dog d=new Dog();
c.speak();
d.speak();
}
}