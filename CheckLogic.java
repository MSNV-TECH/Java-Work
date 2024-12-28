import java.util.*;

class CheckLogic
{
    public static void main(String[] args)
    {
        {
            System.out.println("This is the result.");
            String response = "This is the result.";
            positionOfFirstWord = getFirstWordPosition(response);
            if(positionOfFirstWord == 1) 
                System.out.println("First word is: ", response);
            else
            {
                
            }
        }
    }

    static int getFirstWordPosition(String word_passed)
    {
        if(!word_passed.contains(" "))
            return 1;
        else
            return word_passed.indexOf(" ");
    }   

}