//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> stringArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stringArray.add(scanner.nextLine());
        }
        for (String frase:stringArray){
            System.out.println(getResult(frase));
        }
    }
    public  static String  getResult(String frase){
        String regex = "\\b(\\w+)\\b(?:\\s+\\1\\b)+";
        String replacement = "$1";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher match = p.matcher(frase);
        return match.replaceAll(replacement);

    }
}