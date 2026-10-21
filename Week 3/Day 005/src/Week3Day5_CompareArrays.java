
public class Week3Day5_CompareArrays {
    public static void main(String[] args) {
        System.out.println("{1, 2, 3} + {1, 2, 3} -> " + areEqual(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        System.out.println("{1, 2, 4} + {1, 2, 3} -> " + areEqual(new int[]{1, 2, 4}, new int[]{1, 2, 3}));
        System.out.println("{1, 2, 3} + {3, 2, 1} -> " + areEqual(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
        System.out.println("{1, 2, 3} + {1, 2} -> " + areEqual(new int[]{1, 2, 3}, new int[]{1, 2}));
        System.out.println("{} + {} -> " + areEqual(new int[]{}, new int[]{}));
    }

    public static boolean areEqual(int[] numbers1, int[] numbers2) {
        if (numbers1.length == numbers2.length) {
            for (int i = 0; i < numbers1.length; i++) {
                if (numbers1[i] != numbers2[i]) {
                    return false;
                }
            }
            return true;
        }

        return false;
    }
}
