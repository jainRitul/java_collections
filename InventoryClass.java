import java.util.ArrayList;
import java.util.HashMap;

/**
 * InventoryClass
 */
class InventoryClass {
   ArrayList<Integer>id = new ArrayList<>();
   ArrayList<String>name = new ArrayList<>();
   ArrayList<Integer>quantity= new ArrayList<>();
   ArrayList<Integer>price = new ArrayList<>();
   HashMap<Integer,ArrayList<?>> hm = new HashMap<>();
   

    
}
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Scanner;

// public class InventoryClass {
//     public static void main(String[] args) {
//         List<Integer> id1 = new ArrayList<>();
//         List<String> name = new ArrayList<>();
//         List<Integer> price = new ArrayList<>();
//         List<Integer> quantity = new ArrayList<>();
//         Map<Integer, List<?>> item = new HashMap<>();
//         item.put(1, id1);
//         item.put(2, name);
//         item.put(3, price);
//         item.put(4, quantity);

//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.println("Enter your choice");
//             int choice = scanner.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.println(item);
//                     break;
//                 case 2:
//                     int id2 = scanner.nextInt();
//                     int p = id1.indexOf(id2);
//                     System.out.println(name.get(p));
//                     System.out.println(quantity.get(p));
//                     System.out.println(price.get(p));
//                     break;
//                 case 3:
//                     String name1 = scanner.next();
//                     int q = name.indexOf(name1);
//                     System.out.println(id1.get(q));
//                     System.out.println(quantity.get(q));
//                     System.out.println(price.get(q));
//                     break;
//                 case 4:
//                     int id3 = scanner.nextInt();
//                     id1.add(id3);
//                     String name2 = scanner.next();
//                     name.add(name2);
//                     int price2 = scanner.nextInt();
//                     price.add(price2);
//                     int quantity2 = scanner.nextInt();
//                     quantity.add(quantity2);
//                     break;
//                 case 5:
//                     System.out.println("The quantity for all the items is 5 only");
//                     int id4 = scanner.nextInt();
//                     int quantity3 = scanner.nextInt();
//                     if (quantity3 > 5) {
//                         System.out.println("This quantity isn't available");
//                     } else {
//                         quantity.set(id4, quantity.get(id4) - quantity3);
//                     }
//                     break;
//                 case 6:
//                     System.exit(1);
//                     break;
//                 default:
//                     System.out.println("Invalid choice");
//             }
//         }
//     }
// }
