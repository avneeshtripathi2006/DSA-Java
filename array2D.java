import java.util.*;
class array2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array is:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The transpose of the 2D array is:");
        for(int j = 0; j < cols; j++){
            for(int i = 0; i < rows; i++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of the elements in the 2D array is:");
        int sum = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        System.out.println("The average of the elements in the 2D array is:");
        double average = (double) sum / (rows * cols); 
        System.out.println(average);
        System.out.println("The largest element in the 2D array is:");
        int max = arr[0][0];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println("The smallest element in the 2D array is:");
        int min = arr[0][0];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println(min);
        System.out.println("The elements of the 2D array in reverse order are:");
        for(int i = rows - 1; i >= 0; i--){
            for(int j = cols - 1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The elements of the 2D array in spiral order are:");
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;
        while(top <= bottom && left <= right){
            for(int j = left; j <= right; j++){
                System.out.print(arr[top][j] + " ");
            }
            top++;
            for(int i = top; i <= bottom; i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if(top <= bottom){
                for(int j = right; j >= left; j--){
                    System.out.print(arr[bottom][j] + " ");
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println();
    }
}