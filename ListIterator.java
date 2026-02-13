/** Represents an iterator over a list of CharData objects. */
public class ListIterator {

    Node current;

    public ListIterator(Node node) {
        current = node;
    }

    public boolean hasNext() {
        return (current != null);
    }
  
    public CharData next() {
        CharData cd = current.cp;
        current = current.next;
        return cd;
    }
}