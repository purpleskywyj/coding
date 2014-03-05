package cracking_test;

public class cracking_test {
	public static boolean isUniqueChar2(String str)
	{
		if(str.length()>256) return false;
		boolean[] char_set = new boolean[256];
		for(int i = 0; i<str.length();i++)
		{
			int val = str.charAt(i);
			if(char_set[val]) return false;
			else char_set[val]=true;
		}
		return true;
	}
	public static void main(String[] agrs)
	{
		String st="aabcde";
		boolean b=isUniqueChar2(st);
		System.out.println(b);
	}
}