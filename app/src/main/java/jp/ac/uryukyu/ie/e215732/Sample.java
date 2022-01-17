package jp.ac.uryukyu.ie.e215732;

public class Sample {
    String Slotter;
    String Rank;

    /**
     * rundamメソッド
     * 0〜引数までの整数値の範囲でランダムに返す。
     * @param Len 整数値
     * @return 0~Len の範囲の内、ランダムで返される整数値
     */

    public static int rundam(int Len){
        int result = new java.util.Random().nextInt(Len);
        return result;
    }

    /**
     * judgeメソッド
     * 上記のrundamメソッドで返される数値が一桁に収まるかを調べる。
     * もしも9以下で収まるならTrueを、収まらないならFalseを返す。
     * @param ran 整数値
     * @return 上記のメソッドの実行結果で返される数値によって、返される真偽値
     */

    public static boolean judge(int ran){
        int result1 = rundam(ran);
        boolean answer1;
        if(result1 >= 0 && result1 <= 10){
            answer1 = true;
            return answer1;
        }else{
            answer1 = false;
            return answer1;
        }
        
    }

    /**
     * Sampleメソッド
     * Mainメソッドで使用するメソッド。
     * 引数をコマンドで作用させる。（質問に「ランク」と「名前」が付属する。）
     * もし、「引く」と答えた際には「結果」が出て、どの結果が出たとしても「再トライ」の是非を聞く。
     * 「再トライ」で「引く」と答えれば、再度「結果」が現れる。
     *　使用する人間が「止める」を選択するまで続く。
     * @param Slotter　文字列
     * @param Rank　文字列
     */

    public static void Sample(String Slotter, String Rank){
        System.out.println("------------------------");
        System.out.println(Rank + "ランクの" + Slotter + "さん、スロットを引きますか？");
        System.out.println("[0]:引く");
        System.out.println("[1]:止める");
        int answer = new java.util.Scanner(System.in).nextInt();
        int point = 0;
        if (answer == 0){
            point++;
            System.out.println(point);
        }
        if (answer == 1){
            System.exit(0);
        }
        while(answer == 0 || point == 1 ){
            int a = rundam(9);
            int b = rundam(9);
            int c = rundam(9);
            System.out.println("🟥🟥🟥🟥🟥");
            System.out.println(a + " | "  +  b + " | " + c );
            System.out.println("🟥🟥🟥🟥🟥");
            if (a == b && b == c){
                if (a == 7){
                    System.out.println("おめでとう！！大当たりですよ");
                    System.out.println("------------------------");
                    System.out.println("再トライなさいますか？");
                    System.out.println("[0]:引く");
                    System.out.println("[1]:終了");
                    int answer1 = new java.util.Scanner(System.in).nextInt();
                    point--;
                    if (answer1 == 0){
                        point++;
                        System.out.println(point);
                    }
                    if (answer1 == 1){
                        System.exit(0);
                    }
                }else{
                    System.out.println("普通の当たりですよ！！");
                    System.out.println("------------------------");
                    System.out.println("再トライなさいますか？");
                    System.out.println("[0]:引く");
                    System.out.println("[1]:終了");
                    int answer2 = new java.util.Scanner(System.in).nextInt();
                    point--;
                    if (answer2 == 0){
                        point++;
                    }
                    if (answer2 == 1){
                        System.exit(0);
                    }
                }
            }else{
                System.out.println("残念ハズレだよん");
                System.out.println("------------------------");
                System.out.println("再トライなさいますか？");
                System.out.println("[0]:引く");
                System.out.println("[1]:終了");
                int answer3 = new java.util.Scanner(System.in).nextInt();
                point--;
                    if (answer3 == 0){
                        point++;
                    }
                    if (answer3 == 1){
                        System.exit(0);
                    }
            }
        }
    }
}