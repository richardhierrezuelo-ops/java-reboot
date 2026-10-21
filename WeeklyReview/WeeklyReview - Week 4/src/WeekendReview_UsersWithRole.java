public class WeekendReview_UsersWithRole {
//   matrix lookup + filtering + helper-method reuse.
    public static void main(String[] args) {

        String[] users = {"Alice", "Bob", "Carol", "David"};

        String[] roles = {"ADMIN", "REPORTS", "TRADING", "AUDIT"};

        int[][] permissions = {
                {1, 1, 0, 0},
                {0, 1, 1, 0},
                {1, 0, 1, 1},
                {0, 0, 1, 0}
        };

        printUsersWithRole(users, roles, permissions, getRoleIndex(roles, "TRADING"));
    }

    public static void printUsersWithRole(
            String[] users,
            String[] roles,
            int[][] permissions,
            int roleIndex) {

        for (int i = 0; i < permissions.length; i++) {
            if (permissions[i][roleIndex] == 1 ){
                System.out.println(users[i]);
            }
        }

    }

    public static int getRoleIndex(String[] roles, String target) {
        for (int i = 0; i < roles.length; i++) {
            if (roles[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
