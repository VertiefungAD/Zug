/**
 * Created by doetken on 14.09.2016.
 */
public class Lok {
    private Waggon first;

    public Lok() {
        first = new Waggon("Kohle_1");
    }

    //  String valueFirst
    //valueFirst

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
            w = first;
            while (w.getNext() != null) {
                counter++;
                w=w.getNext();
            }
        }
        return counter;
    }

    public String getValue(int pos) {
        Waggon w = this.first;
//        for (int i = 0; i < pos - 1; i++) {
        //           w = w.getNext();
        //     }
        if (pos >= this.size()) {
            while (pos <= this.size()) {
                w = w.getNext();
                pos++;
            }
        }
        return w.getValue();
    }
}

