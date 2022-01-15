package jp.ac.uryukyu.ie.e215732;

public class Sample {
    String Slotter;
    String Rank;

    /**
     * 
     * @param Slotter
     * @param Rank
     * @return 
     */

    public static int rundam(int Len){
        int result = new java.util.Random().nextInt(Len);
        return result;
    }

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



    public static void Sample(String Slotter, String Rank){
        System.out.println("------------------------");
        System.out.println(Rank + "ランクの" + Slotter + "さん、スロットを引きますか？");
        System.out.println("[0]:引く");
        System.out.println("[1]:止める");
        int answer = new java.util.Scanner(System.in).nextInt();
        int point = 1;
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