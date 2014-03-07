package cracking_test;

public class cracking_test {
	
	public static boolean isRotation(String s1, String s2)
	{
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 != len2 || len1<0) return false;
		String s1s1=s1+s1;
		return isSubstring(s1s1,s2);

	}
}
