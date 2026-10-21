public class ReportService {

    private final Exporter exporter;

    public ReportService(Exporter exporter) {
        this.exporter = exporter;
    }

    public void generateReport(String content) {
        exporter.export(content);
    }
}