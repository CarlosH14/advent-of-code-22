import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws IOException {
        String fileName = "DayOne2/src/Input.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String input = br.readLine();
        Integer auxCalories = 0;
        ArrayList<Integer> auxMaxs = new ArrayList<>();

        do{
            if (input.isBlank()) {
                auxMaxs.add(auxCalories);
                auxCalories = 0;
            } else {
                auxCalories += Integer.valueOf(input);
            }
            input = br.readLine();
        }while(input != null);

        System.out.println(auxMaxs);
        
        Integer maxCalories1 = Collections.max(auxMaxs);
        auxMaxs.remove(maxCalories1);
        Integer maxCalories2 = Collections.max(auxMaxs);
        auxMaxs.remove(maxCalories2);
        Integer maxCalories3 = Collections.max(auxMaxs);
        Integer totalCalories = maxCalories1 + maxCalories2 + maxCalories3;
        System.out.println("Total:"+totalCalories);
        br.close();
    }
}
