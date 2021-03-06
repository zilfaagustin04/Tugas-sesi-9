import java.util.Arrays;
import sort.MagicSort;

public class Main {
    public static void main(String[] args) {
        Integer sourceData[] = {1,2,3,4,5,6,7,8,9};
        MagicSort magicSort = new MagicSort(sourceData);

        // Normal ascending
        System.out.println("Normal Ascending");
        MagicSort normalAsc = magicSort.manualAsc();
        System.out.println("Result         : " + Arrays.toString(normalAsc.getResult()));
        System.out.println("Swapped        : " + normalAsc.getTotalSwaped());
        System.out.println("Execution Time : " + normalAsc.getExecutionTime(false) + " Nano Second");
        System.out.println("===========================");

        // normal descending
        System.out.println("Normal Descending");
        MagicSort normalDesc = magicSort.manualDesc();
        System.out.println("Result         : " + Arrays.toString(normalDesc.getResult()));
        System.out.println("Swapped        : " + normalDesc.getTotalSwaped());
        System.out.println("Execution Time : " + normalDesc.getExecutionTime(false) + " Nano Second");
        System.out.println("===========================");
    }
}
