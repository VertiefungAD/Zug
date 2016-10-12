/**
 * Created by doetken on 14.09.2016.
 */
public class List<T> {
    private Waggon<T> first;

    public List() {

    }
    //  String valueFirst
    //valueFirst

    public void addValue(T value) {
        if (this.first == null) {
            this.first = new Waggon<T>(value);
        } else {
            Waggon<T> w = this.first;
            while (w.getNext() != null) {
                w = w.getNext();
            }
            w.setNext(new Waggon<T>(value));
        }
    }

    public int size() {
        int counter = 1;
        Waggon<T> w;
        if (this.first != null) {
            w = first;
            while (w.getNext() != null) {
                counter++;
                w = w.getNext();
            }
        }
        return counter;
    }

    public T getValue(int pos) {
        Waggon<T> w = this.first;
        if (pos != 0) {
            for (int i = 0; i < pos; i++) {
                w = w.getNext();
            }
        }
        return w.getValue();
    }

    public void insert(int pos, T valueNeu) {
        Waggon<T> w = this.first;
        Waggon<T> wNext = this.first;
        int i = 0;

//      1. zur Position gehen
        while (pos <= i) {
            w = w.getNext();
            pos++;
        }
//       2. nächsten Waggon merken
        while (pos <= i + 1) {
            wNext = wNext.getNext();
            pos++;
        }
        //        3. neuen Waggon einfügen
        Waggon<T> wNeu = new Waggon<T>(valueNeu);
        w.setNext(wNeu);
        wNeu.setNext(wNext);
    }

    public void remove(int pos) {
        Waggon<T> w = this.first;
        if (pos == 0) {
            Waggon<T> neuFirst = w.getNext();
            this.first = neuFirst;
        } else {
            int i = 0;
            while (i < pos - 1) {
                w = w.getNext();
                i++;
            }
            w.setNext(w.getNext().getNext());
        }
    }

    public void removeValue(T value) {
        Waggon<T> w = this.first;
        while (!(w.getNext().getValue().equals(value))) {
            w = w.getNext();
        }
        w.setNext(w.getNext().getNext());
    }

    private class Waggon<T> {
        private T value;
        private Waggon<T> next;

        public Waggon(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Waggon<T> getNext() {
            return next;
        }

        public void setNext(Waggon<T> next) {
            this.next = next;
        }
    }

}

