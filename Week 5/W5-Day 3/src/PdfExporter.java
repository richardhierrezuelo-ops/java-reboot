public class PdfExporter implements Exporter {

    @Override
    public void export(String content) {
        System.out.println("Exporting PDF: " + content);
    }
}