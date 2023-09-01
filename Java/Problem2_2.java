package Java;
import java.util.*;

public class Problem2_2 {
    public static void main(String[] args) {

        // 1匹目のペットオブジェクトの生成
        Pet pet1 = new Pet();

        // 1匹目のペットデータを設定
        pet1.setType("犬");
        pet1.setName("コタロー");
        pet1.setAge((byte)4);
        pet1.setGender(false);

        // 2匹目のペットオブジェクトの生成
        Pet pet2 = new Pet();

        // 2匹目のペットのデータを設定
        pet2.setType("猫");
        pet2.setName("ミー");
        pet2.setAge((byte)2);
        pet2.setGender(true);

        // 2匹のペットの紹介文を取得し、表示する
        System.out.println(pet1.getIntroduction());
        System.out.println(pet2.getIntroduction());

    }
}


// ここにPetクラスを作成してください。

class Pet{
    //動物の種類
 private String type;
    //ペットの名前
 private String name;
    //年齢
 private byte age;
    //(ture：メス　false：オス）
 private boolean gender;

    public void setType(String type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(byte age){
        this.age = age;
    }

    public void setGender(boolean gender){
        this.gender = gender;
    }

    public String  getIntroduction(){
        String gen;

        if(this.gender){
            gen = "オス";
        }else{
            gen ="メス";
        }

        String nenrei = Byte.toString(this.age);

        String introduction =type+"の"+name+"は"+gen+"で"+nenrei+"歳です。";

        return introduction;
    }
}