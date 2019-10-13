package encryptdecrypt;

public class Main {

    public static void main(String[] args) {
        String s = "we found a treasure!";
        char[] arr = s.toCharArray();

        StringBuffer reverse = new StringBuffer();

        for (char c : arr) {
            char ch = Character.isLowerCase(c) ? (char)(219 - c) : c;
            reverse.append(ch);
        }

        System.out.println(reverse.toString());
    }
}
