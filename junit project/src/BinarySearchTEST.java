import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BinarySearchTEST {

    @Test
    public void testBinarySearchFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(4, BinarySearch.binarySearch(arr, 5)); // 5 is at index 4
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(-1, BinarySearch.binarySearch(arr, 11)); // 11 is not in the array
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.binarySearch(arr, 1)); // Array is empty
    }

    @Test
    public void testBinarySearchSingleElementFound() {
        int[] arr = {5};
        assertEquals(0, BinarySearch.binarySearch(arr, 5)); // Only element is 5
    }

    @Test
    public void testBinarySearchSingleElementNotFound() {
        int[] arr = {5};
        assertEquals(-1, BinarySearch.binarySearch(arr, 3)); // 3 is not in the array
    }
}
