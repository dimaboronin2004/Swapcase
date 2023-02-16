import java.util.Scanner;

public class Swapcase {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
        String[] string = sc.nextLine().split("");
        StringBuilder builder = new StringBuilder();
        for (String ch: string) {
            if (ch.matches("[a-zа-яё]")) builder.append(ch.toUpperCase());
            else if (ch.matches("[А-ЯA-ZЁ]")) builder.append(ch.toLowerCase());
            else if (ch.matches("[0-9]")) builder.append("_");
            else builder.append(ch);
        }
        System.out.println("Changed input string: " + builder);
    }
}