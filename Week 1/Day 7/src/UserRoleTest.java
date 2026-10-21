public class UserRoleTest {
    public static void main(String[] args) {
        System.out.println(UserRole.ADMIN.getRole());
        System.out.println("Admin can access admin_panel: " + UserRole.ADMIN.canAccess("admin_panel"));
        System.out.println("Viewer can access code: " + UserRole.VIEWER.canAccess("code"));
    }
}
