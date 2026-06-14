public class length_of_String {
    public static void main(String[] args) {
        String str = new String("Singh");
        int n = str.length();
        int count = 0;

        for(int i =0; i<n; i++) {
            count++;
        }
        System.out.println(count);
    }
}