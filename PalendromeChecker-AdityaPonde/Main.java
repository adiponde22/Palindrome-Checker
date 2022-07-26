//importing everything for reading file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) throws FileNotFoundException
  {

    //new object for file
    File myFile = new File("words.txt");
    //new scanner that scans file object
   Scanner fileScan = new Scanner(myFile);
    
  //set as 111 for test
    String userString = "";
     while (fileScan.hasNextLine())
    {
      userString = fileScan.nextLine();
       Palendromes myP = new Palendromes(userString);
       myP.palendromeChecker();
      //test cases to check if the string is a palendrome      
       if (!myP.checker())
       {
         System.out.println("NOT a Palindrome:   " + userString );
       }

       else 
       {
          System.out.println(" is a Palindrome:   " + myP.palendromeChecker());
       }
    }
   
  }
}

class Palendromes 
  {
    private String myString;
    private String reversedString;
    private String originalStr;
    
    //constructor
    public Palendromes (String p)
    {
      myString = p;
    }
    
    public String palendromeChecker ()
    {
      String unrev = myString;
      //removes everything except letters and numbers
      unrev = unrev.replaceAll("[^a-zA-Z1-9]", "").toLowerCase();
      int index = unrev.length();
      String reversed = "";
      //reverse the string
      while (index > 0)
      {
        reversed += unrev.charAt(index-1);
        index -= 1;
      }

      reversedString = reversed;
      originalStr = unrev;
      return reversed;
      
    }
    //checking if the string is a plaendrome
    public boolean checker()
    {
      boolean torf = false;
    
      if (reversedString.equals(originalStr) && !reversedString.equals(""))
      {  
        torf = true;
      }
      
      return torf;
    }

  }



