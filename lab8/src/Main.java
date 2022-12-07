import java.awt.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;




public class Main {

    //pism govno
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(" -- ADD --"); // 1
        SecondPart.add(list);

        System.out.println(" -- DELETE --"); // 1
        SecondPart.delete(list);
        System.out.println(" -- Find Substring --"); // 6
        SecondPart.search(list);
        System.out.println(" -- Work with files --"); // 7
        SecondPart.init(list);
        System.out.println(" -- XML -- "); // 3
        SecondPart.writeXmlFile(list);
        System.out.println(" -- Compare 2 elements -- "); // 8
        SecondPart.compareElements(list);


        System.out.println("Initial list: " + list);
        int amount = FirstPart.searchSame(list);
        System.out.println("Amount of same elements: " + amount);


        ArrayList<String> reverseList = FirstPart.reverseStrings(list);
        System.out.println("\nReversed list: " + reverseList);

        System.out.print("\nLetters count: ");
        FirstPart.countLetters(list);

        System.out.print("\nSorted elements by length asc: ");
        FirstPart.countLength(list);

        FirstPart.dynamicAsStatic(list, 2);


    }

}