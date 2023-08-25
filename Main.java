import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //判断基準となるnumを0として設定
        int num = 0;
        
        Scanner a  = new Scanner(System.in);
        int A = a.nextInt();
        a.close();

        //入力が0とそれ以外で分岐
        if(A==num){
            System.out.println("入力は0です");
        }
        else{
            System.out.println("入力は0ではありません");
        }

        
    }
}
