public class SelectionSoft {
    public int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallerNumber = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < smallerNumber) {
                    smallerNumber = arr[j];
                    arr[j] = arr[i];
                    arr[i] = smallerNumber;
                }
            }

        }
        return arr;
    }
}
