import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String sWord)
{
  String noCap = sWord.toLowerCase();
  String noSpaces="";
  for (int i =0; i<noCap.length();i++){
    if (noCap.charAt(i)!=' '){
      noSpaces = noSpaces + noCap.charAt(i);
    }
  else{
  }
 }
 String onlyLetters = "";
 for (int i=0; i<noSpaces.length(); i++){
  if (Character.isLetter(noSpaces.charAt(i))==true){
    onlyLetters = onlyLetters + noSpaces.charAt(i);
  }
  else{
  }
 }
 return reverse(onlyLetters).equals(onlyLetters);
  //return false;
}
public String reverse(String str)
{
    String sNew = new String();
    for (int i = str.length()-1; i>=0; i--){
    sNew= sNew + str.charAt(i);
  }
    return sNew;
  
}
}
