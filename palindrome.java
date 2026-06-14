public class palindrome {
    public static void main(String[] args) {

        String str = new String("non");
        String reverse = "";

        for(int i=str.length()-1;i>=0;i--) {
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)) {
            System.out.println("Yes it is Palindrome");
        } else {
            System.out.println("No it is not Palindrome");
        }
    }
}