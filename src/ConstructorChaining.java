
class A
{
    {
        System.out.println(1);
    }
}
 
class B extends A
{
    {
        System.out.println(2);
    }
}
 
class C extends B
{
    {
        System.out.println(3);
    }
}
 
 public class ConstructorChaining
{
    @SuppressWarnings("unused")
	public static void main(String[] args)
    {
        C c = new C();
    }
}

 //is this Overloading
// static void method(int a){ // do something}
//	 void method(String str){ // do something}