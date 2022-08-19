import java.util.Arrays;
import java.util.Scanner;

public class SortingString {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        str = new String(tempArray);
        System.out.println(str);
    }
}
