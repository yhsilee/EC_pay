
import java.util.Scanner;

/*
class Group {
    public int number; //Group Members 有幾位
}
*/

public class test {
    public static void main(String[] args) {
    	float money;
    	int people;
    	float average;
        System.out.println("請輸入金額:");
        Scanner howmuch = new Scanner(System.in);
        System.out.println("請輸入人數:");
        Scanner howmany = new Scanner(System.in);
        money = howmuch.nextFloat();
        people=howmany.nextInt();
        average=money/people;
        System.out.print("金額:"+ average);
    }
}