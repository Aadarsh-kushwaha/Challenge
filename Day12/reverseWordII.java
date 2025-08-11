package Day12;
class reverseWordII {
    public static void swap(char[] arr, int i, int j) {
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;

        while (i < n) {
            // Skip spaces
            while (i < n && arr[i] == ' ') {
                i++;
            }
            int j = i;
            // Find end of word
            while (j < n && arr[j] != ' ') {
                j++;
            }
            // Reverse the word
            swap(arr, i, j - 1);
            i = j;
        }

        return new String(arr);
    }
}
