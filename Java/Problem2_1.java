package Java;


public class Problem2_1 {
        public static void main(String[] args) {
                //未来エンジニア養成所Blogのオブジェクト指向の基本問題1-1
                //問題2-2(1-1なのに問題2－2なの意味わからん)

            // Employeeクラスのオブジェクトを作成
            Employee employee = new Employee();
            // Employeeオブジェクトに社員番号と社員名をセット
            employee.setData(1234, "山田");
            // Employeeオブジェクトの社員番号を出力
            System.out.println("社員番号：" + employee.getId());
            // Employeeオブジェクトの社員名を出力
            System.out.println("社員名：" + employee.getName());
        }
    }

    // ここにEmployeeクラスを作成してください。
//アクセス修飾子を忘れない。厳しい方から「private」、「何も書かない（デフォルトと呼ばれます）」、「protected」、「public」
    class Employee {
            //private修飾子を忘れない
        private int id;
        private String name;


            //numとstrではなくidとnameにすべき
            public void setData(int id,String name){
                //この引数で受け取った値をフィールドにセットする「this.id = id;」の形は、
                //Javaではお決まりのパターンなので自然に記述できるようにしましょう。
                this.id = id;
                this.name = name;
            }

            public int getId(){
                return id;
            }

            public String getName(){
                return name;
            }
    }
    
