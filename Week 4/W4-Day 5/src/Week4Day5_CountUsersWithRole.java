public class Week4Day5_CountUsersWithRole {

// Column-specific processing + counter
    public static void main(String[] args) {

        String[] users = {"Alice", "Bob", "Carol"};
        String[] roles = {"ADMIN", "REPORTS", "TRADING", "AUDIT"};

        int[][] permissions = {
                {1, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 1, 1}
        };

        for (int i = 0; i < roles.length; i++) {
            System.out.println(roles[i] + " -> " + countUsersWithRole(permissions, i)) ;
        }
    }

    public static int countUsersWithRole(int[][] permissions, int roleIndex) {
        int count = 0;
        for (int row = 0; row < permissions.length; row++) {
            if (permissions[row][roleIndex]  == 1) {
                count++;
            }
        }

        return count;
    }


}
