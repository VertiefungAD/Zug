/**
 * Created by doetken on 14.09.2016.
 */
public class Lok {
    Waggon first;
    Waggon wagen;


    public Lok(String valueFirst) {
        first = new Waggon(valueFirst, "first");
    }

    public void addValue(String value) {
        this.wagen = new Waggon(value, ("neuerWaggon" + this.size()));
        this.wagen.setValue(value);
        this.wagen.setNext(wagen);
//        todo: Name, um einen "next" zu ermöglichen...
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
        for (int i = 0; i < pos-1; i++) {
            w = w.getNext();
        }
        return w.getValue();
    }
}

