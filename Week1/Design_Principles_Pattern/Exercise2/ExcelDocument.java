package Week1.Design_Principles_Pattern.Exercise2;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}
