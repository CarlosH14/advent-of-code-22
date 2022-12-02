import java.util.Scanner;
import java.util.StringTokenizer;

public class Day1{
    public static void main(String[] args) {
        Scanner sc = new Scanner();
        String input = sc.next();
        Integer maxCalories;
        StringTokenizer tokens = new StringTokenizer(input, "\n");
        String[] newCalories = new String[tokens.countTokens()];
        int index = 0;
        while(tokens.hasMoreTokens()){
            newCalories[index] = tokens.nextToken("");
            System.out.println(newCalories[index]);
            index++;
        }

    }
}


