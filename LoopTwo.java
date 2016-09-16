public class LoopTwo
{
    private int[] nums;

    public LoopTwo(int n)
    {
       
    }
    public int loadRandom(int min, int max)
    {
        for(int i; i < nums.length; i++)
        {
            int result = (int)(Math.random() * max) + min;
            nums[i] = result;
        }
    }
    public int printArray()
    {
        for(int i; i < nums.length; i++)
        {
            System.out.print(nums);
        }
    }
    public int sortArray()
    {
        for(int i; i < nums.length; i++)
        {
            nums.sort();
        }
    }
    public int findAverage()
    {
        for(int i; i < nums.length; i++)
        {
            nums.average();
        }
    }
}
