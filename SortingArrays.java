import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        String[] Electronics = {"TV","Laptop","Mbbile",
    "Keyboard","Headphones","fan","AC","Cooler","Mouse","Remote"};
    // String ToSorting = ToSorting(Electronics);
    Arrays.sort(Electronics);
    // Arrays.
    System.out.println("Sorted Electronics List: ");

    for (String e:Electronics){
        System.out.print(e+ ",");
    }
    System.err.println();
    }
}
