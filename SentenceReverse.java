import java.util.Scanner;

public class SentenceReverse {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2;
        String a[] = str1.split(" ");
        for(int i=0;i<a.length;i++){
            str2 = "";
            for(int j=a[i].length()-1;j>=0;j--){
                str2 = str2+a[i].charAt(j);
            }
            a[i] = str2;
        }
        str2="";
        for(int i=0;i<a.length;i++){
            str2 = str2+a[i]+" ";
        }
        System.out.println(str2.toLowerCase());
    }
}
