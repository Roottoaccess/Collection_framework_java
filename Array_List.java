import java.util.ArrayList;

// import javax.swing.text.html.HTMLDocument.Iterator;

import java.lang.Thread;
public class Array_List extends Thread{
    public static void main(String[] args) {
        

        ArrayList<Integer> studentName= new ArrayList<>();

        // Adding the elements in the array
        studentName.add(1);
        studentName.add(2);
        studentName.add(3);

        System.out.println(studentName);

        studentName.add(4);
        System.out.println(studentName);

        // How to add an element in the specific index in ArrayList
        studentName.add(1, 50);

        System.out.println(studentName);


        // Creating a new List all total
        ArrayList <Integer> newlist = new ArrayList<>();
        newlist.add(150);
        newlist.add(160);

        studentName.addAll(newlist);

        System.out.println(studentName);

        // Get  function
        System.out.println(studentName.get(1));

        // Remove function (position)
        studentName.remove(5);
        System.out.println(studentName);

        // Remove function(By the element name)
        studentName.remove(Integer.valueOf(3));
        System.out.println(studentName);


        /* Again creating a new ArrayList */
        ArrayList<Integer> demo = new ArrayList<>();
        demo.add(10); demo.add(20); demo.add(30);
        System.out.println();
        System.out.println(demo);
        System.out.println("After removing the total demo arraylist.....");
        // Removing the complete array list
        demo.clear();
        System.out.println(demo);


        // Updating any element
        studentName.set(2,1000);
        System.out.println(studentName);

        // Checking if the element is present or not
        System.out.println(studentName.contains(50));

        // Now how to iterate inside the array list
        System.out.println("Itarating in the Array List.....");
        try{
            for(int i: studentName){
                System.out.print(i+" ");
                Thread.sleep(500);
            }
        }catch(Exception e){
            System.out.println(e);
        }

    }
}