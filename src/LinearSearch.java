public class LinearSearch {

    private LinearSearch() {}

    public static int searchInt(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = { 24, 18, 12, 9, 16, 66, 43, 4 };

        int res1 = LinearSearch.searchInt(data, 16);
        System.out.println(res1);

        int res2 = LinearSearch.searchInt(data, 666);
        System.out.println(res2);
    }
}
