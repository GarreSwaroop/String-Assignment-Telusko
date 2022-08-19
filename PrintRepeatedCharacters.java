import java.util.Scanner;

public class PrintRepeatedCharacters {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char string[] = str.toCharArray();
        int count;
        for(int i=0;i<str.length();i++){
            count = 1;
            for(int j=i+1;j<string.length;j++){
                if(string[i] == string[j] && string[i] !=' '){
                    count++;
                    string[j] = '0';
                }
            }
            if(string[i] !='0' && count>1){
                System.out.println(string[i]);
            }
        }
    }
}
