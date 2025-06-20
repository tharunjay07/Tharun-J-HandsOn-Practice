package Week1.Design_Principles_Pattern.Exercise2;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document.");
    }
}