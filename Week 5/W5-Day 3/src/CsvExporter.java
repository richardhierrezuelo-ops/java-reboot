public class CsvExporter implements Exporter{

    @Override
    public void export(String content) {
        System.out.println("Exporting CSV: " + content);
    }
}
