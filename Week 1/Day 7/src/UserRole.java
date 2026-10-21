public enum UserRole {
    ADMIN("ADMIN"),
    MANAGER("MANAGER"),
    DEVELOPER("DEVELOPER"),
    VIEWER("VIEWER");


    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public boolean canAccess(String feature) {
        // Simple implementation - you can make this more sophisticated later
        if (this == ADMIN) return true;
        if (this == MANAGER) return !feature.equals("admin_panel");
        if (this == DEVELOPER) return feature.equals("code") || feature.equals("deploy");
        return false;   // VIEWER
    }
}
