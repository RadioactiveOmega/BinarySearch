import java.util.Arrays;

public class BinarySearch <T extends Comparable<T>> {

    private final T[] objects;

    public BinarySearch(T[] objects) {
        if (objects == null) throw new NullPointerException("Array may not be null");
        this.objects = Arrays.copyOf(objects, objects.length);
    }

    public T[] getObjects() {
        return Arrays.copyOf(objects, objects.length);
    }

    public int search(T elementToSearch) {

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
