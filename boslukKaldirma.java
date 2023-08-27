import java.util.Scanner;

public class boslukKaldirma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dizeyi girin.");

        String input = sc.nextLine();
        System.out.println("Orjinal dize: " + input);

        input = input.replaceAll("\\s", "");
        System.out.println("Son dize: " + input);
        sc.close();
    }
}
