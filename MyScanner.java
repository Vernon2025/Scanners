import java.util.ArrayList;
import java.util.Scanner;

public class MyScanner
{
    public static void main(String[] args) {
        MyScanner myScanner = new MyScanner();
        myScanner.run();
    }
    @SuppressWarnings("InfiniteLoopStatement")
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                String scan_input = scanner.nextLine();
                process_user_input(scan_input);
            }
        }
    }
    public void process_user_input(String scan_input) {
        ArrayList<Integer> intList = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        Scanner scanner = new Scanner(scan_input);
        if (scan_input.contains(",")) {
            scanner.useDelimiter(",");
        }
        if (scanner.hasNextInt()) {
            while (scanner.hasNextInt()) {
                intList.add(scanner.nextInt());
            }
        } else {
            while (scanner.hasNext()) {
                strList.add(scanner.next());
            }
        }
        if (strList.size() > 0) {
            System.out.println("Here is a list of strings:");
            for (String s : strList) {
                System.out.println(s.trim());
            }
        } else if (intList.size() > 0) {
            System.out.println("Here is a list of integers:");
            for (Integer i : intList) {
                System.out.println(i);
            }
            System.out.println();
            System.out.println("Here is the list of integers multiplied by 3:");
            for (Integer i : intList) {
                System.out.println(i*3);
            }
        } else {
            System.out.println("ERROR: No words or integers detected!!");
        }
        System.out.println();
    }
}