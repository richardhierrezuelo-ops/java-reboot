public enum GradeLevel {
    FRESHMAN(1),
    SOPHOMORE(2),
    JUNIOR(3),
    SENIOR(4);

    private final int year;

    GradeLevel(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}