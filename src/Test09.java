public class Test09 {

    private static void printArr(int[] arr) {
        for (int anArr : arr) {
            System.out.print(anArr + " ");
        }
    }

    
    private static int partition(int[] arr, int left, int right) {
        int temp = arr[left];
        while (right > left) {
            // ���жϻ�׼���ͺ���������αȽ�
            while (temp <= arr[right] && left < right) {
                --right;
            }
            // ����׼�������� arr[right]�������
            if (left < right) {
                arr[left] = arr[right];
                ++left;
            }
            // ������ arr[right] ��Ҫ�����
            while (temp >= arr[left] && left < right) {
                ++left;
            }
            if (left < right) {
                arr[right] = arr[left];
                --right;
            }
        }
        arr[left] = temp;
        return left;
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (arr == null || left >= right || arr.length <= 1)
            return;
        int mid = partition(arr, left, right);
        quickSort(arr, left, mid);
        quickSort(arr, mid + 1, right);
    }
    


    public static void main(String[] args) {
        int[] arr = {6, 4, 3, 2, 7, 9, 1, 8, 5};
        quickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
