import java.util.Scanner;
public class StringStat
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String data = sc.nextLine();
        int upper = 0;
        int lower = 0;
        int digits = 0;
        int spaces = 0;

        for (int i = 0; i < data.length(); i++)
        {
            char ch = data.charAt(i);
            if (Character.isUpperCase(ch))
                upper++;
            else if  (Character.isLowerCase(ch))
                lower++;
            else if  (Character.isDigit(ch))
                digits++;
            else if (Character.isWhitespace(ch))
                spaces++;
        }

        System.out.println("UpperCase Character Count = "+upper);
        System.out.println("LowerCase Character Count = "+lower);
        System.out.println("Digit Count = "+digits);
        System.out.println("WhiteSpace Count = "+spaces);
    }
}
