/**
 * Created by doetken on 14.09.2016.
 */
public class List<T> {
    private Waggon<T> first;

    public List() {
    }

    public void add(T value) {
        if (this.first == null) {
            this.first = new Waggon<>(value);
        } else {
            Waggon<T> w = this.first;
            while (w.next != null) {
                w = w.next;
            }
            w.next = new Waggon<>(value);
        }
    }

    public int size() {
        int counter = 1;
        Waggon<T> w;
        if (this.first != null) {
            w = first;
            while (w.next != null) {
                counter++;
                w = w.next;
            }
        }
        return counter;
    }

    public T get(int pos) {
        Waggon<T> w = this.first;
        if (pos <= size()) {
            for (int i = 0; i < pos; i++) {
                w = w.next;
            }
            return w.value;
        } else {
            throw new RuntimeException("Position überschreitet Größe");
        }
    }

    public void add(int pos, T valueNeu) {
        Waggon<T> w = this.first;
        Waggon<T> wNext = this.first;
        int i = 0;

//      1. zur Position gehen
        while (pos <= i) {
            w = w.next;
            pos++;
        }
//       2. nächsten Waggon merken
        while (pos <= i + 1) {
            wNext = wNext.next;
            pos++;
        }
        //        3. neuen Waggon einfügen
        Waggon<T> wNeu = new Waggon<T>(valueNeu);
        w.next = wNeu;
        wNeu.next = wNext;
    }

    public void remove(int pos) {
        Waggon<T> w = this.first;
        if (pos == 0) {
            Waggon<T> neuFirst = w.next;
            this.first = neuFirst;
        } else {
            int i = 0;
            while (i < pos) {
                w = w.next;
                i++;
            }
            w.next = w.next.next;
        }
    }

    public void remove(T value) {
        Waggon<T> w = this.first;
        while (!(w.next.value.equals(value))) {
            w = w.next;
        }
        w.next = w.next.next;
    }

    private class Waggon<T> {
        private T value;
        private Waggon<T> next;

        public Waggon(T value) {
            this.value = value;
        }
    }
}

