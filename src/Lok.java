/**
 * Created by doetken on 14.09.2016.
 */
public class Lok {
    private Waggon first;

    public Lok() {

    }
    //  String valueFirst
    //valueFirst

    public void addValue(Object value) {
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
        int counter = 1;
        Waggon w;
        if (this.first != null) {
            w = first;
            while (w.getNext() != null) {
                counter++;
                w = w.getNext();
            }
        }
        return counter;
    }

    public Object getValue(int pos) {
        Waggon w = this.first;
        for (int i = 1; i < pos; i++) {
            w = w.getNext();
        }
//        while (pos <= this.size()) {
//            w = w.getNext();
//            pos++;
//        }
        return w.getValue();
    }

    //   public void insertValue(int pos, Object value) {
    //      if (pos <= this.size()) {
    //        Waggon w1 = this.first;
    //      Waggon w2 = this.first;
    //    Waggon wNeu = new Waggon(value);
    //  for (int i = 0; i < pos + 1; i++) {
    //    w1 = w1.getNext();
    //}
    //           for (int i = 0; i < pos; i++) {
    //             w2 = w2.getNext();
    //       }
    //     w2.setNext(wNeu);
    //   wNeu.setNext(w1);
    //      }
    // }

    public void insert(int pos, Object valueNeu) {
        Waggon w = this.first;
        Waggon wNext = this.first;
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
        Waggon wNeu = new Waggon(valueNeu);
        w.setNext(wNeu);
        wNeu.setNext(wNext);
    }

    public void remove(int pos) {
        Waggon w = this.first;
        if (pos == 0) {
            Waggon neuFirst = w.getNext();
            this.first = neuFirst;
        } else {
            int i = 0;
            while (pos <= i) {
                w = w.getNext();
                pos++;
            }
            w.setNext(w.getNext().getNext());
        }
    }

    public void removeValue(Object value) {
        Waggon w = this.first;
        while (!(w.getNext().getValue().equals(value))) {
            w = w.getNext();
        }
        w.setNext(w.getNext().getNext());
    }
}

