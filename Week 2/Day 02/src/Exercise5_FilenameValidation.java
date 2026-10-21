public class Exercise5_FilenameValidation {
    public static void main(String[] args) {
        System.out.println("resume.pdf -> " + isValidPdfFile("resume.pdf"));
        System.out.println("report.pdf -> " + isValidPdfFile("report.pdf"));
        System.out.println("document.txt -> " + isValidPdfFile("document.txt"));
        System.out.println("resume.PDF -> "  + isValidPdfFile("resume.PDF"));
        System.out.println("\"\" -> " + isValidPdfFile(""));
        System.out.println("\"   \" -> " + isValidPdfFile("   "));
    }

    public static boolean isValidPdfFile(String filename) {
        return !filename.isBlank() && filename.endsWith(".pdf");
    }
}
