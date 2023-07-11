public class mol
{
    public void add(int a)
    {
        System.out.println(a+0);
    }
    public void add(int a ,int b)
    {
        System.out.println(a+b);
    }
    public void add (int a,int b,int c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String args[])
    {
        mol O=new mol();
        O.add(3);
        O.add(3,5);
        O.add(3,5,7);
    }
}