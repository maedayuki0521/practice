import java.util.*;

public class Sample21 {
    public static void main(String[] args) throws Exception {
        // 問題21 整数値を入力させその値が5より大きく20よりも小さければOKと表示する
        
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        if(5 < a&&a < 20){
            System.out.println("ok");
        }
        
        
    }
}
