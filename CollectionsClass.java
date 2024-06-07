import java.util.*;
public class CollectionsClass {
    public static void main(String[] args) {
        
        List <Integer> list = new ArrayList<>();

        list.add(32);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(88);

        System.out.println("min element: "+ Collections.min(list));

        System.out.println("max element: "+ Collections.max(list));

        System.out.println("frequency: "+Collections.frequency(list, 88));

        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);
    }
}
