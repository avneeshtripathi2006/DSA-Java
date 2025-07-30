import java.util.*;
class array1D{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i =1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Enter a number to search:");
        int search = sc.nextInt();
        int low = 0, high = n - 1, mid = 0;
        boolean found = false;
        while(low <= high){
            mid = (low + high) / 2;
            if(arr[mid] == search){
                found = true;
                break;
            } else if(arr[mid] < search){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(found){
            System.out.println("Element found at index: " + mid);
        } else {
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}