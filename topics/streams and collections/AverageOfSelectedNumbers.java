
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            list.add(Integer.valueOf(input));
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String ans = scanner.nextLine();
        if(ans.equals("n")){
            double avg = list.stream()
            .mapToInt(s->Integer.valueOf(s))
            .filter(x->x<0)
            .average()
            .getAsDouble();
            System.out.println("Average of the negative numbers: "+avg);
        }
        if(ans.equals("p")){
            double avg = list.stream()
            .mapToInt(s->Integer.valueOf(s))
            .filter(x->x>0)
            .average()
            .getAsDouble();
            System.out.println("Average of the positive numbers: "+avg);
        }
    }
}
 