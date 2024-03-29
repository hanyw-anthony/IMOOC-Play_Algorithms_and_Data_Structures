public class LinearSearch {

    private LinearSearch() {}

    /**
     * int版线性查找
     * @param data 目标数组
     * @param target 目标元素
     * @return 返回目标元素的索引；若不存在，返回-1
     */
    public static int searchInt(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 泛型版线性查找
     * @param data 目标数组
     * @param target 目标元素
     * @return 返回目标元素的索引；若不存在，返回-1
     */
    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // int版测试
        int[] data = { 24, 18, 12, 9, 16, 66, 43, 4 };
        int res1 = LinearSearch.searchInt(data, 16);
        System.out.println(res1);
        int res2 = LinearSearch.searchInt(data, 666);
        System.out.println(res2);

        // 泛型版测试
        // 使用Integer测试
        Integer[] integers = { 24, 18, 12, 9, 16, 66, 43, 4 };
        int res3 = LinearSearch.search(integers, 16);
        System.out.println(res3);
        int res4 = LinearSearch.search(integers, 666);
        System.out.println(res4);

        // 使用自定义类 - MyStudent
        MyStudent[] students = MyStudent.samples;
        int res5 = LinearSearch.search(students, new MyStudent("Li Si"));
        System.out.println(res5);
        int res6 = LinearSearch.search(students, new MyStudent("Xiao Gong"));
        System.out.println(res6);

        // 使用自定义类 - Student (随堂)
        Student[] students2 = {
                new Student("Alice"),
                new Student("Bobo"),
                new Student("Charles"),
        };
        int res7 = LinearSearch.search(students, new MyStudent("Bobo"));
        System.out.println(res7);
        int res8 = LinearSearch.search(students, new MyStudent("Xiao Gong"));
        System.out.println(res8);

        // 性能测试
        int[] dataSize = {1000000, 10000000};
        for(int n: dataSize) {
            Integer[] dataSet = ArrayGenerator.generateOrderedArray(n);

            int runs = 1000;
            long startTime = System.nanoTime();
            for (int k = 0; k < runs; k++)
                LinearSearch.search(dataSet, n);
            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000.0;
            System.out.println("n = " + n + ", " + runs + " runs : " + time + " ms");
        }
    }
}
