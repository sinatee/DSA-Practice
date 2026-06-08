public class Main
{
    public static void main(String[] args)
    {
        String a = "abcdefgxcvv";
        String b = "abcdefxcvvg";

        Solution sol = new Solution();
        
        boolean result = sol.isAnagram(a, b);
        System.out.println(result);
    }
}
