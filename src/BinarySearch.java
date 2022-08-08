public class BinarySearch{

    public static <T extends Comparable<T>> int search(T[] objects, T elementToSearch){

        if (objects == null || elementToSearch == null) throw new NullPointerException("Array or element to search may not be null");

        int top = objects.length - 1;
        int low = 0;
        int mid;

        while (low <= top) {
            mid = (top + low) / 2;

            int result = objects[mid].compareTo(elementToSearch);

            if (result < 0) low = mid + 1;
            else if (result > 0) top = mid - 1;
            else return mid;
        }
        return -1;
    }

}
