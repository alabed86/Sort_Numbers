package src.Sort;
public class Sorter {

    public static int[] sort(int[] unsorted) {

        int[] sorted = new int[unsorted.length];
        sorted[0] = unsorted[0];

        for(int i = 1; i < unsorted.length; i++) {
            if(unsorted[i] < sorted[i-1]) {
                for(int j = i-1; j >= 0; j--) {
                    if(unsorted[i] < sorted[j]) {
                        sorted[j+1] = sorted[j];
                        sorted[j] = unsorted[i];
                    } else {
                        break;
                    }
                }
            } else {
                sorted[i] = unsorted[i];
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("Innan sortera: ");
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + ", ");
        }
        System.out.println("Efter sortera: ");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + ", ");
        }
        System.out.println("-------------------------------------------------");

        return sorted;
    }
}
