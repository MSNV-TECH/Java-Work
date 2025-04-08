import java.util.*;
import java.io.*;

class CheckLogic
{
    public static void main(String[] args)
    {
        System.out.println("This is the result.");
        String response = "This is the response.";
        int positionOfFirstWord = getFirstWordPosition(response);
        if(positionOfFirstWord == 1) { System.out.println("First word is: " + response); }
        else { System.out.println("Deugging"); }
        Byte b = Byte.decode("0x5");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        String resp = sc.next();
        System.out.print(resp);
        sc.close();
        System.out.println();
        processInput(b);
    }

    static int getFirstWordPosition(String word_passed)
    {
        if(!word_passed.contains(" "))
            return 1;
        else
            return word_passed.indexOf(" ");
    }   

    static void processInput(Byte dataByte)
    {
        System.out.println(dataByte);
    }

}