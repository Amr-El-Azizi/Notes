public class ArrayFun
{
void printDoubles (double[] nums)
{
    for(int i = 0; i < nums.length; i++)
    System.out.println(nums[i]);
}
void printReverseString (String[] str)
{
    for(int i = str.length-1; i >=0; i--)
    System.out.println(str[i]);
}
public ArrayFun()
{
    double [] nums = new double[5];
    nums[0]=2.5;
    nums[1]=3;
    nums[2]=3.5;
    nums[3]=4;
    nums[4]=4.5;
    printDoubles ( nums);
    
    String [] str = new String[4];
    str[0] = "you?";
    str[1] = "are";
    str[2] = "How";
    str[3] = "Hi,";
    printReverseString ( str );
}
}