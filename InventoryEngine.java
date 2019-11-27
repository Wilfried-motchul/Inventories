import java.util.*;
import java.io.*;

public class InventoryEngine {

   public static void main(String [] args) {
      Inventory inv = new LogInventory();
      testInventory(inv);
      //populate(inv, "data/alphabet.txt");
      System.out.println(inv + " size = " +inv.size());

   }
   public static void populate (Inventory inv, String fileName){
      try {
         Scanner file = new Scanner(new File(fileName));
         while (file.hasNextLine()){
            String line = file.nextLine();
            for(int i = 0 ; i < line.length(); i++){
               inv.add(line.charAt(i));
            }
         }
      }catch(FileNotFoundException e){
         System.out.print("can't populate" +fileName);
      }
     
   }
   
   public static void testInventory(Inventory inv){
     inv.add('a');
     inv.add('a');
     inv.add('d');
     inv.add('d');
     inv.add('b');
     inv.subtract('b');
     inv.subtract('d');
     inv.subtract('a');
     inv.set('c', 20);
     inv.add('b');
      System.out.println ("the number of c letter is "+ inv.get('c'));
      System.out.println ("the number of d letter is "+ inv.get('d'));
      System.out.println(inv);
      System.out.println("is the inventoey countain a ? "+inv.contains('a'));
      System.out.println("is the inventory empty? "+inv.isEmpty());
   }
}