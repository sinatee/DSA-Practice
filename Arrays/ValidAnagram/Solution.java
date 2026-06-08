class Solution
{
    public boolean isAnagram(String s, String t)
    {

        if (s.length() != t.length())
        {
            return (false);
        }
        char[] letter_table = new char[26];

        for (int i = 0; i < s.length(); i++)
        {
            letter_table[s.charAt(i) - 'a'] += 1;
            letter_table[t.charAt(i) - 'a'] -= 1;
        }

        for (char i : letter_table)
        {
            if (i != 0)
            {
                return (false);
            }
        }
        return (true);
    }
}
