
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> wordlist = new ArrayList<>();
        while(true){
            String word = scanner.nextLine();
            if(Integer.valueOf(word)<0){
                break;
            }
            wordlist.add(Integer.valueOf(word));
        }
        wordlist.stream()
            .filter(word -> word>=1 && word<=5)
            .forEach(word -> System.out.println(word));

    }

    
}
