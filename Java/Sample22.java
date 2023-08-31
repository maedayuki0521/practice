package Java;
import java.util.*;

public class Sample22 {
    public static void main(String[] args) throws Exception {
        // 10以上または-10以下
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num > 10||num <-10){
            System.out.println("ok");
        }
        
        scanner.close();
            }
}
