/**
 * Created by doetken on 14.09.2016.
 */
public class Waggon {
    Object value;
    String name;
    Waggon next;

    public Waggon(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Waggon getNext() {
        return next;
    }

    public void setNext(Waggon next) {
        this.next = next;
    }
}
