public class rect
{
    public static void main(String args[])
    {
        int l=10 , b=5;
        rect O = new rect();
        O.area(l,b);
    }
    public void area (int a,int b)
    {
        int ar=a*b;
        System.out.println(ar);
    }
}