public class ContiguousSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 9, 12, 13};
        printSubarrays(arr);
    }

    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}