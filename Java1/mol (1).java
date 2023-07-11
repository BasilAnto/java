//mol-1
public class mol
{
    public void add(int a)
    {
        System.out.println(a+5);
    }
    public void add(float b)
    {
        System.out.println(5+b);
    }
    public void add (double c)
    {
        System.out.println(5+c);
    }
    public static void main(String args[])
    {
        mol O=new mol();
        O.add(3);
        O.add(3.3);
        O.add(3.33);
    }
}