public class print_characters_of_string {
    public static void main(String[] args) {

        String name = "Siddhant";
        int n = name.length();

        for(int i=0; i<n; i++) {
            char ch = name.charAt(i);
            System.out.print(ch + " ");
        }
    }
}