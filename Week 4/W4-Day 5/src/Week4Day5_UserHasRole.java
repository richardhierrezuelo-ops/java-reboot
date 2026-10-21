public class Week4Day5_UserHasRole {

    public static void main(String[] args) {

        String[] users = {"Alice", "Bob", "Carol"};
        String[] roles = {"ADMIN", "REPORTS", "TRADING", "AUDIT"};

        int[][] permissions = {
                {1, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 1, 1}
        };

        System.out.println("Alice, ADMIN -> " + hasRole(permissions, getUserIndex(users, "Alice"), getRoleIndex(roles, "ADMIN")));
        System.out.println("Alice, AUDIT -> " + hasRole(permissions, getUserIndex(users, "Alice"), getRoleIndex(roles, "AUDIT")));
        System.out.println("Bob, REPORTS -> " + hasRole(permissions, getUserIndex(users, "Bob"), getRoleIndex(roles, "REPORTS")));
        System.out.println("Carol, AUDIT -> " + hasRole(permissions, getUserIndex(users, "Carol"), getRoleIndex(roles, "AUDIT")));

    }

    public static boolean hasRole(int[][] permissions, int userIndex, int roleIndex) {
        if (userIndex == -1 || roleIndex == -1) {
            return false;
        }
        return permissions[userIndex][roleIndex] == 1;
    }

    public static int getUserIndex(String[] users, String target) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].equals(target)) {
                return i;
            }
        }
        return -1;
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
