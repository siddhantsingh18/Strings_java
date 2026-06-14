import java.util.*;

public class user_input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Provide the content");

        String str = sc.nextLine();
        System.out.println("Value : " + str);

        System.out.println("Provide the content");

        String str2 = sc.nextLine();
        System.out.println("Value : " + str2);

        System.out.println(str + " " + str2);
    }
}