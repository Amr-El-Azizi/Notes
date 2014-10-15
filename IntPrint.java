public class IntPrint
{
    public IntPrint()
    {
        int x = 100234213;
        forwardprintint(x);
    }
    
    void printint (int n)
    {
        int a = n;
        for (int i = 0; n!=0; i++)
        {
            if((n-i)%10 == 0)
            {
                n = (n-i)/10;
                System.out.println(i);
                i = -1;
            }
        }
    }
    
        void forwardprintint (int n)
    {
        int z = n;
        int tens = 1;
                while(z>0)
        {
            z = z/10;
            tens = tens * 10;
        }
        tens = tens/10;
                for (int i = 0; n >0; i++)
        {
            if((n-(i*tens))<tens)
            {
                n = (n-(i*tens));
                System.out.println(i);
                i = -1;
                tens = tens/10;
            }
        }
    }
    
    void printDigits (int z)
    {
        while(z>0)
        {
            int digit = z % 10;
            System.out.println(digit);
            z = z/10;
        }
    }
}
