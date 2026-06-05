
class Document {

    private StringBuffer textBuffer;

    public Document() {
        textBuffer = new StringBuffer();
    }

    public void addText(String input) {
        textBuffer.append(input);
    }

    public void clearText() {
        textBuffer.setLength(0);
    }

    public void reverseText() {
        textBuffer.reverse();
    }

    public void deleteText(int start, int end) {

        if (start >= 0 && end <= textBuffer.length() && start < end) {
            textBuffer.delete(start, end);
        } else {
            System.out.println("Invalid index range");
        }
    }

    public void displayText() {
        System.out.println(textBuffer.toString());
    }

}

public class phase1 {

    public static void main(String[] args) {
        Document doc = new Document();
        doc.addText("yahajdoa");
        System.out.print("After adding: ");
        doc.displayText();
        doc.reverseText();
        System.out.print("After reverse: ");
        doc.displayText();

        doc.deleteText(0, 5);
        System.out.print("After delete: ");
        doc.displayText();

        doc.clearText();
        System.out.print("After clear: ");
        doc.displayText();
    }
}
//second commit
