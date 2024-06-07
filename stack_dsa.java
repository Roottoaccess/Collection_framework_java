import java.util.Stack;
public class stack_dsa {
    public static void main(String[] args) {
        
        Stack<String> animals = new Stack<>();

        /* Pushing multiple elements in the stack */
        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        /* Printing all the elements in the stack */
        System.out.println("stack: "+animals);

        /* fetching the first element in the stack */
        System.out.println(animals.peek());

        // Pop operation
        animals.pop();
        System.out.println(animals);
        
    }
}
