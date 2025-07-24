public class curstomArray {
    private int[] array;
    private int count = 0;

    public curstomArray(int size) {
        array = new int[size];
    }

    public void add(int number) {
        if (array.length == count) {
            int[] newArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[count] = number;
        count++;
    }

    public int IndexOf(int number) {
        for (int i = 0; i < count; i++) {
            if (array[i] == number) {
                System.out.println("Index of " + number + " is: " + i);
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;

    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int[] reverse() {
        int[] reversedArray = new int[count];
        int reversedIndex = 0;
        for (int i = count; i > 0; i--) {
            reversedArray[reversedIndex] = array[i - 1];
            reversedIndex++;
        }
        return reversedArray;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println("Index of " + i + " is: " + array[i]);
        }
    }

}
