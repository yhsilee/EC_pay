
import java.util.Scanner;

/*
class Group {
    public int number; //Group Members ���X��
}
*/

public class test {
    public static void main(String[] args) {
    	float money;
    	int people;
    	float average;
        System.out.println("�п�J���B:");
        Scanner howmuch = new Scanner(System.in);
        System.out.println("�п�J�H��:");
        Scanner howmany = new Scanner(System.in);
        money = howmuch.nextFloat();
        people=howmany.nextInt();
        average=money/people;
        System.out.print("���B:"+ average);
    }
}