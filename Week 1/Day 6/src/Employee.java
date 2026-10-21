public class Employee {
    private final String id;
    private final String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Employee other = (Employee) obj;
        return id.equals(other.id);           // Usually compare business key
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

// Golden Rule: If you override equals(), you must override hashCode().

}
