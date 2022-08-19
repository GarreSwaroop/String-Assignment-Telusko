import java.util.Scanner;

public class CountSpecialCharacters {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='a' && str.charAt(i)<='z')
                || (str.charAt(i)>='0' && str.charAt(i)<='9')){
                count++;
            }
        }
        System.out.println("The number of special characters in the string are: "+(str.length()-count));
    }
}
