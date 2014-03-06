package cracking_test;

public class cracking_test {
	public static boolean permutation(String str1, String str2)
	{
		if(str1.length()!=str2.length()) return false;
		return sort(str1).equals(sort(str2));
	}
	public static String sort(String str)
	{
		char[] char_set = str.toCharArray();
		java.util.Arrays.sort(char_set);
		return new String(char_set);
	}
	public static boolean permutation2(String s, String t)
	{
		if(s.length()!=t.length()) return false;
		int[] letter = new int[256];
		for(int i=0;i<s.length();i++)
		{
			int val= s.charAt(i);
			letter[val]++;
		}
		for(int j=0;j<t.length();j++)
		{
			if(--letter[(int)t.charAt(j)]<0) return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		String st1="abcde";
		String st2="bcade";
		boolean b=permutation2(st1,st2);
		System.out.println(b);
	}
}
