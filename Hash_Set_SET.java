import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class Hash_Set_SET {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        // Set <Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        // Ignore the duplicate value due to hash technique
        set.add(54);

        // Displaying the value of set
        System.out.println(set);

        // Removing the value and displaying the hashset again
        set.remove(21);
        System.out.println(set);

        // Checking if the element is present in the set or not
        System.out.println(set.contains(65));

        // Does out set is currently empty or not ?
        System.out.println(set.isEmpty());

        // Size()
        System.out.println(set.size());

        // Clear
        /* System.out.print(set.clear());
         */
    }
}
