public class ReportDemo {

    public static void main(String[] args) {
        Exporter exporter = new PdfExporter();

        ReportService reportService = new ReportService(exporter);
        reportService.generateReport("Monthly Sales");

        exporter = new CsvExporter();
        reportService = new ReportService(exporter);
        reportService.generateReport("Annual Revenue");

    }
}
