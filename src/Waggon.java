/**
 * Created by doetken on 14.09.2016.
 */
public class Waggon {
    String value;
    String name;
    Waggon next;

    public Waggon(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Waggon getNext() {
        return next;
    }

    public void setNext(Waggon next) {
        this.next = next;
    }
}
