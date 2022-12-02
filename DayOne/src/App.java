import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {

        String fileName = "src/Input.txt";
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String input = br.readLine();
        Integer maxCalories = 0;
        Integer auxCalories = 0;
        while(input!=null){

            if(input.isBlank()){
                auxCalories=0;
            }else{
                auxCalories += Integer.valueOf(input);
            }

            if (auxCalories >= maxCalories) {
                maxCalories = auxCalories;
            }
            input = br.readLine();
        }
        System.out.println(maxCalories);
        br.close();
        
    }
}
