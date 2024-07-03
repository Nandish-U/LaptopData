abstract class Hii
{
    abstract void m2();
}
public class Demo extends Hii
{
    @Override
    public void m2()
    {
        System.out.println("Hello");
    }
    public void m1()
    {
        System.out.println("ok");
    }
    public static void main(String[] args)
    {
        System.out.println("Hello");
    }
}