import java.util.*;

public class Sample23 {
    public static void main(String[] args) throws Exception {
        // 5以上10未満ならOK、それ以外ならNG
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>5&&num<10){
            System.out.println("ok");
        }
        else{
            System.out.println("ng");
        }
        
        scanner.close();
            }
}
