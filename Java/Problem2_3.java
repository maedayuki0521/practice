package Java;

public class Problem2_3 {
    public static void main(String[] args) {
        // Personクラスのオブジェクトを作成
        Person[] persons = { new Person(), new Person(), new Person() };
        // Personオブジェクトに氏名と年齢をセット
        persons[0].setData("大島", 30);
        persons[1].setData("村上", 30);
        persons[2].setData("黒沢", 32);
        // 自己紹介
        for(int i = 0; i < persons.length; i++) {
            persons[i].introduce();
        }
        System.out.println();
        // 年齢差をチェック
        persons[0].compare(persons[1]);
        persons[1].compare(persons[2]);
        persons[2].compare(persons[1]);
    }
}

class Person {
    private String name;
    private int age;

    public void setData(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void introduce(){
        System.out.println("私の名前は"+this.name+"、年齢は"+this.age+"です。");
    } 

    public void compare(Person person){
        if(this.age>person.age){
            System.out.println("ワタクシ"+this.name+"は、"+person.name+"さんより"+(this.age-person.age)+"歳年上です");
        }
        else if(this.age<person.age){
            System.out.println("ワタクシ"+this.name+"は、"+person.name+"さんより"+(person.age-this.age)+"歳年下です");
        }
        else{
            System.out.println("ワタクシ"+this.name+"は、"+person.name+"さんと同じ年齢です");
        }
    }

}