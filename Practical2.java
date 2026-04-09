class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

    // Default constructor (creates 2x2 zero matrix)
    public Matrix() {
        this.rows = 2;
        this.cols = 2;
        data = new int[rows][cols];
    }

    // Parameterized constructor
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    // Constructor with 2D array
    public Matrix(int[][] input) {
        this.rows = input.length;
        this.cols = input[0].length;
        data = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                data[i][j] = input[i][j];
    }

    // Set value
    public void setValue(int i, int j, int value) {
        data[i][j] = value;
    }

    // Get value
    public int getValue(int i, int j) {
        return data[i][j];
    }

    // Display matrix
    public void display() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Transpose of matrix
    public Matrix transpose() {
        Matrix result = new Matrix(cols, rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[j][i] = data[i][j];
            }
        }
        return result;
    }

    // Matrix multiplication
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Matrix multiplication not possible!");
        }

        Matrix result = new Matrix(this.rows, other.cols);

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < this.cols; k++) {
                    result.data[i][j] += this.data[i][k] * other.data[k][j];
                }
            }
        }
        return result;
    }
}

// Main class
public class Practical2 {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        Matrix m1 = new Matrix(a);
        Matrix m2 = new Matrix(b);

        System.out.println("Matrix A:");
        m1.display();

        System.out.println("\nMatrix B:");
        m2.display();

        // Transpose
        Matrix t = m1.transpose();
        System.out.println("\nTranspose of A:");
        t.display();

        // Multiplication
        Matrix product = m1.multiply(m2);
        System.out.println("\nA x B:");
        product.display();
    }
}
