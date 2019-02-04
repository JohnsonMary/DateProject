package Repl.it;

public class MergeStr {
	public static void main(String[] args) {
		
		System.out.println(mergeStrings("hello","book"));
		
	}

	
	public static String mergeStrings(String one, String two) {

        int mlen = (one.length() > two.length()) ? one.length() : two.length();
        String str = "";
        int i = 0, j = 0;
        String str1 = "", str2 = "";
        for (int k = 0; k < mlen; k++) {
            if (k > one.length() - 1) {
                i = one.length() - 1;
                str1 = "";
            } else {
                i = k;
                str1 = "" + one.charAt(i);
            }
            if (k > two.length() - 1) {
                j = two.length() - 1;
                str2 = "";
            } else {
                j = k;
                str2 = "" + two.charAt(j);
            }
            str += str1 + str2;
        }

        return str;
    }
}
