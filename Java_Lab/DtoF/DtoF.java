import java.util.Scanner;
class DtoF
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String data = sc.nextLine();
        String newStr = "";

        for (int i = 0; i < data.length(); i++)
        {
            char ch = data.charAt(i);
            if (ch == 'd')
                newStr += 'f';
            else if (ch == 'D')
                newStr += 'F';
            else
                newStr += ch;
        }
        sc.close();
        System.out.print("The new string : "+newStr);
    }
}
