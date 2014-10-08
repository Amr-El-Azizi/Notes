public class PassByValue
{
    void increaseBy1( int x)
    {
        x++;
    }
    void flip(boolean b)
    {
        b=!b;
    }
    public PassByValue()
    {
       int f = 22;
       increaseBy1(f);
       
       System.out.println(f);
       
       boolean boo1 = false;
       flip(boo1);
       
       System.out.println(boo1);
    }
}
