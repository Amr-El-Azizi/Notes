public class PassByWHAT
{
    public PassByWHAT()
    {
        int[] a = {1,1,1};
        int[] b = {2,2,2};
        int[] c = {3,3,3};
        int[] d = {4,4,4};
        
        print(a);
        print(b);
        print(c);
        print(d);
        
        System.out.println("\n");
        
        a = b;
        
        print(a);
        
        a[0] = 1;
        
        print(b);
        
        b[0] = 2;
        
        print(a);
        
        b = d;
        
        print(a);
        
        print(b);
        
        b[0] = 10;
        
        print(a);
        
        print(d);
        
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



