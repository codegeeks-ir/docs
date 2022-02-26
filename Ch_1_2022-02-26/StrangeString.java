import java.util.Scanner;
public class StrangeString
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        String[] input1 = scan.nextLine().split(""); // ex: a b b a
        String[] input2 = scan.nextLine().split(" ");// ex: dog fish fish dog

        int[] answerArr = new int[input1.length];
        answerArr[0] = 1; // 1 is true.

        for(int i=1; i<input1.length; i++)
        {
            if(input1[i].equals(input1[i-1]))
            {
                if(input2[i].equals(input2[i-1]))
                {
                    answerArr[i] = 1; // true
                    continue;
                }
                answerArr[i] = 0; // false
            }
            else if(!input1[i].equals(input1[i-1]))
            {
                if(!input2[i].equals(input2[i-1]))
                {
                    answerArr[i] = 1; // true
                    continue;
                }
                answerArr[i] = 0; // false
            }
        }
        // chack if at least one 0 in answerArr return false.
        for(int i=0; i<answerArr.length; i++)
        {
            if(answerArr[i] == 0)
            {
                System.out.println(false);
                System.exit(0);
            }
        }
        System.out.println(true);
        scan.close();
    }
}