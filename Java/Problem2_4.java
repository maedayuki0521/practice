package Java;

public  class Problem2_4{
    public static void main(String[] args) {
        // シェフオブジェクトの生成
        Chef chef = new Chef();
        // 食材オブジェクトの生成
        Egg egg = new Egg();
        Rice rice = new Rice();
        Milk milk = new Milk();
        Cheese cheese = new Cheese();
        // シェフがフルコースを調理します
        System.out.println("1品目は" + chef.cook(egg, cheese) + "です");
        System.out.println("2品目は" + chef.cook(rice, egg) + "です");
        System.out.println("3品目は" + chef.cook(rice, cheese) + "です");
        System.out.println("4品目は" + chef.cook(milk, egg) + "です");
    }
}
// 各種食材クラス
class Egg{}
class Rice{}
class Milk{}
class Cheese{}
// ここにChefクラスを作成してください

class Chef{
  public String cook(Egg egg,Cheese cheese){
      return("スクランブルエッグ");
  }
  public String cook(Rice rice,Egg egg){
      return("オムライス");
  }
  public String cook(Rice rice,Cheese cheese){
      return("リゾット");
  }
  public String cook(Milk milk,Egg egg){
      return("プディング");
  }
}

//1つのクラスに同じ名前のメソッドを複数定義できるテクニックこそが「オーバーロード」です。
//しかし、同じ名前のメソッドであっても「シグネチャ」は異なっていないといけません。
//ここがポイントです。
//メソッドにおける「シグネチャ」とは、メソッド名＋引数の数＋引数の型の組み合わせのことです。