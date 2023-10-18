import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list=new ArrayList<>(10);
//        list.add(12);
//        list.add(874);
//        list.add(86);
//        list.add(568);
//        list.add(986);

//        System.out.println(list.contains(12));// true
//        //System.out.println(list.contains(2383736));// false
//
//        System.out.println(list);
//
//        list.set(0,100); // remove the element from the particular index
//
//        list.remove(2);
//
//        System.out.print(list);

// input
        for (int i=0;i<5;i++){
            list.add(in.nextInt());
        }
       // System.out.println(list);

   // get item at any index

for (int i=0;i<5;i++){
    System.out.println(list.get(i));// pass index here ,list[index] syntax will not work here
}

        System.out.println(list);
        }
}
