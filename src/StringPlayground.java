public class StringPlayground {
    public static int returnCount(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') { count++; }
            else if (c == ')') { count--; }
        }
        return count;
    }
    public static void main(String[] args) {
        // Test cases
        String s1 = "((3 + 7) * 2)";
        String s2 = "(3 + 7) * 2)";
        String s3 = "((3 + 7 * 2)";
        String s4 = "";

        System.out.println(returnCount(s1));
        System.out.println(returnCount(s2));
        System.out.println(returnCount(s3));
        System.out.println(returnCount(s4));
    }
}