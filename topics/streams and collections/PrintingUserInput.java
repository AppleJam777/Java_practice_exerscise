
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordlist = new ArrayList<>();
        while(true){
            String word = scanner.nextLine();
            if(word.isEmpty()){
                break;
            }
            wordlist.add(word);
        }
        System.out.println(wordlist);

    }
}
