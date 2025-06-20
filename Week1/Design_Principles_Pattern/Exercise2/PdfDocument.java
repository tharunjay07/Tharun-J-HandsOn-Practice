package Week1.Design_Principles_Pattern.Exercise2;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}
