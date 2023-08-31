package Java;
import java.util.Scanner;

public class Sample1 {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        String[] string = input.split(" ");
        int[] num = new int[string.length];
        
        
        for(int i=0;i<string.length;i++){
            num[i]=Integer.parseInt(string[i]);
            System.out.println(num[i]);
        }
        scanner.close();
}
}
