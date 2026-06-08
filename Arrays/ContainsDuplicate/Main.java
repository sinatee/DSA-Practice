public class Main
{
    public static void main(String[] args)
    {
        int[] testArray = {1, 2, 3, 4, 5, 1};

        Solution sol = new Solution();

        boolean result = sol.hasDuplicate(testArray);
        System.out.println(result);
    }
}
