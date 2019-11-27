import java.util.*;
import java.io.*;

public class ABCInventory implements Inventory {
   private int As;
   private int Bs;
   private int Cs;
   
   public ABCInventory() {
      As = 0;
      Bs = 0;
      Cs = 0;
   }
   
   public void add(char c){
      c =  Character.toLowerCase(c);
      if(c == 'a'){As ++;}
      else if(c == 'b'){Bs++;}
      else if(c == 'c'){Cs++;}
      
   }
   public void subtract(char c){
    c = Character.toLowerCase(c);
    if(c == 'a'){As--;}
    else if(c == 'b'){Bs--;}
    else if(c == 'c'){Cs--;}
   }
   public int get(char c){
      c = Character.toLowerCase(c);
      if(c == 'a'){return As;}
      else if(c == 'b'){return Bs;}
      else if(c == 'c'){return Cs;}
      else{
      return -1;}
   }
   public void set(char c, int count){
      c = Character.toLowerCase(c);
      switch(c){
         case 'a' : As = count; break; 
         case 'b' : Bs = count; break;
         case 'c' : Cs = count ; break; 
      }      
   
   }
   public boolean contains(char c){
      c = Character.toLowerCase(c);
      return(c == 'a' && As > 0 ) ||
            (c == 'b' && Bs > 0 ) ||
            (c == 'c' && Cs > 0 );
   }
   public int size(){
      return As + Bs + Cs;
   }
   public boolean isEmpty(){
      return (As == 0)&&
             (Bs == 0)&&
             (Cs == 0); //OR I can also do size() == 0 ;
   }

   
   public String toString() {
      return "[A=" + As + ", B=" + Bs + ", C=" + Cs +"]";
   }
}
