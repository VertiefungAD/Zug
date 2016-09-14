/**
 * Created by doetken on 14.09.2016.
 */
public class Lok {
    Waggon first;


    public Lok(String valueFirst) {
        first = new Waggon(valueFirst);
    }

    public void addValue(String value) {
        String name = "neuerWaggon" + this.size() + 1;
        Waggon name;
        for (int i = 0; i < this.size(); i++) {
            name = new Waggon(value);
        }
        name.setValue(value);

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
        for (int i = 0; i < pos; i++) {
            w = w.getNext();
        }
        return w.getValue();
    }
}

