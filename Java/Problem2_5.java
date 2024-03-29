package Java;

public class Problem2_5 {
        public static void main(String[] args) {
            // Squareクラスのオブジェクトを作成
            Square square = new Square(4.5, 2.8);
            // 四角形の情報を出力
            square.inform();
            // 面積の表示
            System.out.println("この四角形の面積は" + square.getArea() + "です。");
            // 幅を3.0増加させる
            square.addWidth(3.0);
            System.out.println();
            // 四角形の情報を出力
            square.inform();
            // 面積の表示
            System.out.println("この四角形の面積は" + square.getArea() + "です。");
        }
    // ここにSquareクラスを作成してください。
    class Square{
private double width;

private double height;

public Square(double width,double height){
    this.width = width;
    this.height = height;
}

public void inform(){
    System.out.println("この四角形の幅は"+this.width+"高さは"+this.height);
}

public double getArea(){
double area = this.width*this.height;
return area;
}

public void addWidth(double width){
    this.width+=width;
}


    }
}
