import java.util.Map;
import java.util.TreeMap;
import java.lang.Thread;
public class HashMap extends Thread{
    public static void main(String[] args) {
        Map <String, Integer> numbers = new TreeMap<>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five",5);

        if(!numbers.containsKey("Two")){
            numbers.put("Two", 24);
        }

        numbers.putIfAbsent("Two", 24);

        // Remove ()
        numbers.remove("Three");

        // In TreeMap it will sort in Key checking

        System.out.println(numbers);

        /* Itarating to map */
        // try{
        //     for(Map.Entry<String , Integer> e: numbers.entrySet()){
        //         System.out.println(e);
    
        //         System.out.println(e.getKey());
        //         System.out.println(e.getValue());
        //         Thread.sleep(500);
        //     }
        // }catch(Exception x){
        //     System.out.println(x);
        // }
    }
}