import java.util.Scanner;

public class MyScanner
{
    public void run() {
       Scanner scanner = new Scanner(System.in);
       while (true) {
           if (scanner.hasNextLine()) {
               String user_input = scanner.nextLine();
               process_user_input(user_input);
               string_user_input(user_input);
           }
       }
    }
    
    
    
    public void process_user_input(String user_input) {
       Scanner int_scanner = new Scanner(user_input);
       if (int_scanner.hasNextInt()) {
           System.out.println("Here is the list of integers:");
           while (int_scanner.hasNextInt()) {
               int int_input = int_scanner.nextInt();
               System.out.println(int_input * 3);
           }
           System.out.println();
       }
    }
    
    
    
    public void string_user_input(String user_input) {
        Scanner str_scanner = new Scanner(user_input);
        if (str_scanner.hasNext()) {
            System.out.println("List of words:");
            while (str_scanner.hasNext()) {
                 String str_input = str_scanner.next();
                 System.out.println(str_input);
            }
            System.out.println();
        } 
    }
    
        public static void main(String[] args) {
       MyScanner myScanner = new MyScanner();
       myScanner.run();
    }    
}
    
    
    
