import java.util.Iterator;

/**
 * Created by doetken on 14.09.2016.
 */
public class List<T> implements Iterable<T> {
    private Waggon first;


    //    public void add(T value) {
//        if (this.first == null) this.first = new Waggon(value);
//        else {
//            Waggon w = this.first;
//            while (w.next != null) {
//                w = w.next;
//            }
//            w.next = new Waggon(value);
//        }
//    }
//     todo add-rekursiv
    public void add(T value) {
        if (first == null) {
            first = new Waggon(value);
        }
//        add(first, value);
    }

//    public int size() {
//        int counter = 1;
//        Waggon w;
//        if (this.first != null) {
//            w = first;
//            while (w.next != null) {
//                counter++;
//                w = w.next;
//            }
//        }
//        return counter;
//    }

    //      Rekursiv ohne Schleifen:
    public int size() {
        return size(first);
    }

    //      Private Methode, weil wir noch einen Parameter brauchen, den wir übergeben:
    private int size(Waggon w) {
//        Leerer Zug?
        if (w == null) return 0;
//      Rekursionsschritt (Selbstaufruf mit dem nächsten)
//      Wagen laufen ganz durch, bis keiner mehr kommt, dann weiss der Letzte, dass bei ihm Länge 1 ist, dann geht´s
//      zurück und alle zählen jeweils einen drauf
        return size(w.next) + 1;
    }

//    public T get(int pos) {
//        Waggon w = this.first;
//        if (pos <= size()) {
//            for (int i = 0; i < pos; i++) {
//                w = w.next;
//            }
//            return w.value;
//        } else {
//            throw new RuntimeException("Position überschreitet Größe");
//        }
//    }

    public T get(int pos) {
        return get(pos, first);
    }

    private T get(int pos, Waggon w) {
        if (pos == 0) return w.value;
        return get(pos-1, w.next);
    }

    public void add(int pos, T valueNeu) {
        if (pos == 0) {
            Waggon w = new Waggon(valueNeu);
            w.next = this.first;
            first = w;
            return;
        }

        Waggon w = this.first;
        int i = 0;


        while (pos < i) {
            w = w.next;
            pos++;
        }

        Waggon wNeu = new Waggon(valueNeu);
        wNeu.next = w.next;
        w.next = wNeu;
    }

    public T remove(int pos) {
        Waggon w = this.first;
        if (pos == 0) {
            Waggon neuFirst = w.next;
            this.first = neuFirst;
        } else {
            int i = 0;
            while (i < pos) {
                w = w.next;
                i++;
            }
            w.next = w.next.next;
        }
        return w.value;
    }

    public T remove(T value) {
        Waggon w = this.first;
        while (!(w.next.value.equals(value))) {
            w = w.next;
        }
        w.next = w.next.next;
        return value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    private class Waggon {
        private T value;
        private Waggon next;

        private Waggon(T value) {
            this.value = value;
        }
    }


    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Waggon w = first;

            public boolean hasNext() {
                return w != null;
            }

            public T next() {
                T t = w.value;
                w = w.next;
                return t;
            }
        };
    }

}

