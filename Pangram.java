import java.util.Locale;
import java.util.Scanner;

public class Pangram {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int flag = 1;
        for(char ch='a';ch<='z';ch++){
            if(!str.contains(String.valueOf(ch))){
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            System.out.println("It is a pangram");
        }
        else{
            System.out.println("It is not a pangram");
        }
    }
}
