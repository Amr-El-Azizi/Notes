public class ArraysInMemory
{

 public void changeReference( int[] arrayToChange)
    {
        int num_elements = arrayToChange.length;
        int newInt [] = new int[num_elements] ;
        
        for(int i = 0 ; i < num_elements; i ++ )
        {
            newInt[i] = 210;
        }
        arrayToChange = newInt;
    }
    
    public void changeValues( int[] arrayToChange )
    {
        for(int i = 0 ; i < arrayToChange.length; i ++ )
        {
            arrayToChange[i] = 9999;
        }
    }
    
    public ArraysInMemory(){
    int[] nums_1 = {1,2,3};
    int nums_2[]  = {4,5,6} ;
    
    nums_2 = nums_1;
    
    
    print("nums_2");
    print(nums_2);
    
    print("set nums_1[1] = 44 ");

    nums_1[1] = 44;
    
    print("nums_2");
    print(nums_2);
   
    print("send nums_2 to changeReference()");
    changeReference(nums_2);
    
 
    print("nums_2");
    print(nums_2);
 
 print("send nums_2 to changeValues()");
    changeValues(nums_2);
    
    
    
    print("nums_2");
    print(nums_2);
 

}
    
    
    
public void forEachLoop(){

    int[] nums = {3,5,11,23, 44};

        for( int n : nums)
            {
            System.out.println(n);
             }

}



/// HELPSERS
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

}
    

    
}
