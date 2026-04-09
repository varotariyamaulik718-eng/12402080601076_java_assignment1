import java.util.Arrays;

class ArrayOperations {
    private int[] arr;

    // Constructor
    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    // Reverse array
    public void reverse() {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    // Sort array
    public void sort() {
        Arrays.sort(arr);
    }

    // Search element
    public int search(int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Average
    public double average() {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Maximum
    public int maximum() {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }
        return max;
    }

    // Display
    public void display() {
        System.out.println(Arrays.toString(arr));
    }
}

class StringOperations {
    private String str;

    // Constructor
    public StringOperations(String str) {
        this.str = str;
    }

    // Reverse string
    public String reverse() {
        return new StringBuilder(str).reverse().toString();
    }

    // Sort string characters
    public String sort() {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Search character
    public int search(char ch) {
        return str.indexOf(ch);
    }

    // Maximum character (based on ASCII)
    public char maximum() {
        char max = str.charAt(0);
        for (char ch : str.toCharArray()) {
            if (ch > max)
                max = ch;
        }
        return max;
    }
}

public class Practical1 {
    public static void main(String[] args) {

        // Array operations
        int[] arr = {5, 2, 9, 1, 7};
        ArrayOperations ao = new ArrayOperations(arr);

        System.out.print("Original Array: ");
        ao.display();

        ao.reverse();
        System.out.print("Reversed Array: ");
        ao.display();

        ao.sort();
        System.out.print("Sorted Array: ");
        ao.display();

        System.out.println("Search 9: Index = " + ao.search(9));
        System.out.println("Average = " + ao.average());
        System.out.println("Maximum = " + ao.maximum());

        // String operations
        StringOperations so = new StringOperations("hello");

        System.out.println("\nOriginal String: hello");
        System.out.println("Reversed String: " + so.reverse());
        System.out.println("Sorted String: " + so.sort());
        System.out.println("Search 'e': Index = " + so.search('e'));
        System.out.println("Maximum Character = " + so.maximum());
    }
}
