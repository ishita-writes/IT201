import java.util.Scanner;
public class Rev_Case
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] words = input.split(" ");
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) 
        {
            reversed += words[i];
            if (i > 0) reversed += " ";
        }

        String finalOutput = "";
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);
            if (Character.isLowerCase(c)) {
                finalOutput += Character.toUpperCase(c);
            } else if (Character.isUpperCase(c)) {
                finalOutput += Character.toLowerCase(c);
            } else {
                finalOutput += c;
            }
        }

        System.out.println("Result: " + finalOutput);
        sc.close();
    }
}
