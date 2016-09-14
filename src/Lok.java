/**
 * Created by doetken on 14.09.2016.
 */
public class Lok {
    private Waggon first;

    public Lok(String valueFirst) {
        first = new Waggon(valueFirst);
    }

    public void addValue(String value) {
        if (this.first == null) {
            this.first = new Waggon(value);
        } else {
            Waggon w = this.first;
            while (w.getNext() != null) {
                w = w.getNext();
            }
            w.setNext(new Waggon(value));
        }
    }

    public int size() {
        int counter = 0;
        Waggon w;
        if (this.first != null) {
            counter = 1;
            w = first;
            while (w.getNext() != null) {
                counter++;
            }
        }
        return counter;
    }

    public String getValue(int pos) {
        Waggon w = first;
        for (int i = 0; i < pos - 1; i++) {
            w = w.getNext();
        }
        return w.getValue();
    }
}

