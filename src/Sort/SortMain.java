package src.Sort;

public class SortMain {
    public static void main(String[] args) {

      int[] unsorted;
      if(args.length > 0) {
          unsorted = new int[args.length];
          try {
              for(int i = 0; i < args.length; i++)
                  unsorted[i] = Integer.valueOf(args[i]);

              Sorter.sort(unsorted);
          } catch(Exception e) {
              System.out.println("Wrong Input");
          }

      } else {
          SortTest.test();
      }
    }
}        
