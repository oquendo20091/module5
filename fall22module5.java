package cop2805; //using cop2805 folder, but not from the actual course work.

import java.util.*;
import java.util.Random;
import java.util.Scanner;
import javafx.stage.Stage;

public class fall22module5 {
   public static int fibonaccir(
       int n) { // finding fibonacci using recursive method funcition

      if (n <= 1) {
         return 1;
      } else {
         return fibonaccir(n - 1) + fibonaccir(n - 2);
      }
   }

   public static int fibonaccii(
       int n) { // finding fibonacci using iterative method function
      if (n <= 1) {
         return 1;
      }
      int r = 0, p = 1, pp = 1, i;
      for (i = 4; i <= n; i++) {
         r = p + pp;
         pp = p;
         p = r;
      }
      return r;
   }

   public static void main(String[] args) {
      int i, n = 80, f1, f2;
      System.out.print("n\tIterative\tRecursive\n");
      System.out.print("==\t=======\t=======\n");
      long start_time, end_time;
      int difference, difference2;
      for (i = 40; i <= n; i++) // looping from 40 to 80
      {
         start_time = System.nanoTime(); // initial time
         f1 = fibonaccii(i); // finding fibonacci using iterative method function
         end_time = System.nanoTime(); // end time
         difference = (int) ((end_time - start_time)
             / 1e6); // difference between end time and start time
         start_time = System.nanoTime(); // initial time
         f2 = fibonaccir(i); // finding fibonacci using recursive method function
         end_time = System.nanoTime(); // end time
         difference2 = (int) ((end_time - start_time)
             / 1e6); // difference between end time and start
         System.out.print(i + "\t\t" + difference + "\t\t\t\t" + difference2
             + "\t\n"); // outputting result
      }
   }
}
