import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count = 0;
        char tempArray[] = str1.toCharArray();
        Arrays.sort(tempArray);
        str1 = Arrays.toString(tempArray);
        char[] tempArray1 = str2.toCharArray();
        Arrays.sort(tempArray1);
        str2 = Arrays.toString(tempArray1);
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i) == str2.charAt(i)){
                count++;
            }
        }
        if(count == str1.length()){
            System.out.println("It is an anagram");
        }
        else{
            System.out.println("It is not an anagram");
        }
    }
}
