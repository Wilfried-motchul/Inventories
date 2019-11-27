import java.util.*;
import java.io.*;

public class LogInventory implements Inventory {
   private ArrayList<Character> log;
   
   public LogInventory(){
      log = new ArrayList<>();
   }
   public void add(char c){
      c = Character.toLowerCase(c);
      log.add(c);
   }
   public void subtract(char c){
      c = Character.toLowerCase(c);
      // why does my method make it only remove one character at the time ? 
      for(int i = 0; i < log.size();i++){
         if (log.get(i) == c ){
            log.remove(i);
         }
      }
   }
   public int get(char c){
      int count = 0 ;
      c = Character.toLowerCase(c);
      for(int i = 0 ; i < log.size(); i++){
         if(log.get(i)== c){
            count++;
         }
      }
      return count;
   
   }
   //this method will print the number of character you will you set your count to. 
   public void set(char c, int count){
      c = Character.toLowerCase(c);
      // how can I use the switch statement here ?
      for(int i = 0 ; i < count; i++){
      log.add(c); 
      }
   }
   public boolean contains(char c){
      c = Character.toLowerCase(c);
      //how can I use the boolean's and here in this method?
      for(int i = 0; i < log.size(); i ++){
         if(log.get(i)== c){
            return true;
         }
      }
      return false;
   
   }
   public int size(){
      return log.size();
   
   }
   public boolean isEmpty(){
      return size() == 0;
   }

   public String toString(){

      return ""+log;
   }
}