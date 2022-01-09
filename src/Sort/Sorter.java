package src.Sort;
public class Sorter {

    public static int[] sort(int[] unsorted_array) {

        int[] sorted = new int[unsorted_array.length];
        sorted[0] = unsorted_array[0];

        for(int i = 1; i < unsorted_array.length; i++) {
            if(unsorted_array[i] < sorted[i-1]) {
                for(int j = i-1; j >= 0; j--) {
                    if(unsorted_array[i] < sorted[j]) {
                        sorted[j+1] = sorted[j];
                        sorted[j] = unsorted_array[i];
                    } else {
                        break;
                    }
                }
            } else {
                sorted[i] = unsorted_array[i];
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Befor sort numbers : ");
        for (int i = 0; i < unsorted_array.length; i++) {
            System.out.print(unsorted_array[i] + ", ");
        }
        System.out.println("After sorting: ");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + ", ");
        }
        System.out.println("-------------------------------------------------");

        return sorted;
    }
}
