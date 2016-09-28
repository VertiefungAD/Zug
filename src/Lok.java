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
                w = w.getNext();
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

    public void insertValue(int pos, String value) {
        if (pos <= this.size()) {
            Waggon w1 = this.first;
            Waggon w2 = this.first;
            Waggon wNeu = new Waggon(value);
            //              while (pos <= this.size()) {
            //                w = w.getNext();
            //              pos++;
            for (int i = 0; i < pos + 1; i++) {
                w1 = w1.getNext();
            }
            for (int i = 0; i < pos; i++) {
                w2 = w2.getNext();

            }
            w2.setNext(wNeu);
            wNeu.setNext(w1);
        }
    }

    public void insert(int pos, String valueNeu) {
        Waggon w = this.first;
        Waggon wNext = this.first;


//      1. zur Position gehen
        if (pos >= this.size()) {
            while (pos <= this.size()) {
                w = w.getNext();
                pos++;
            }
//       2. nächsten Waggon merken
            while (pos <= this.size() + 1) {
                wNext = wNext.getNext();
                pos++;
            }
        }
//        3. neuen Waggon einfügen
        Waggon wNeu = new Waggon(valueNeu);
        w.setNext(wNeu);
        wNeu.setNext(wNext);


    }
}

