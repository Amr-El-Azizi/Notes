public class MoreArrayPassBy
{
    public MoreArrayPassBy()
    {
        int[] a = {1,1,1};
        int[] b = {2,2,2};
        int[] c = {2,2,2};
        a = b;
        b = c;
        c[0] = 3;
        b[1] = 4;
        a[2] = 5;
        print(a);
    }
    
        public void print(String s){
    System.out.println("printing : " + s ) ;
}  

public void print(boolean[] b){
for( boolean inB : b)
    System.out.println(b);

}
    

public void print(int[] nums){
for( int n : nums)
    System.out.println(n);
    System.out.println("\n");

}
}
