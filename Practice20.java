import java.util.*;

public class Practice20 {
    public static void main(String[] args) throws Exception {
        //入力を二つ受け取り、一つ目の数字を二つ目の数字で割った後、二つ目の数字で掛ける
        //udemyのプログラミング500本ノック問題20

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] strInput = input.split(" ");
        int[] num = new int[strInput.length];

        for(int i=0;i<strInput.length;i++){
            num[i]=Integer.parseInt(strInput[i]);
        }

        scanner.close();

        int fir = num[0];
        int sec = num[1];

        System.out.println(fir/sec);
        System.out.println(fir/sec*sec);
    }
}