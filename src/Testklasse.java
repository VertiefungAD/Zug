/**
 * Created by doetken on 05.10.2016.
 */
public class Testklasse {

    private List zug = new List();
    private Object eins = new String("Erster");
    private Object zwei = new String("Zweiter");
    private Object drei = new String("Dritter");
    private Object vier = new String("Vierter");
    private Object fuenf = new String("Fünfter");
    private Object sechs = new String("Sechster");
    private Object sieben = new String("Siebter");

    private String[] array = {"Erster", "Zweiter", "Dritter", "Vierter", "Fünfter", "Sechster", "Siebter"};

    public Testklasse() {
    }

    public void test() {
        if (addTest())
            System.out.println("Die addValue() - Methode oder die size() - Methode hat ein Fehler produziert.");
//        if (insertTest()) System.out.println("Die insert() - Methode hat ein Fehler produziert.");
        if (insertTest()) System.out.println("Die insertValue() - Methode hat ein Fehler produziert.");
//        if (getValueTest()) System.out.println("Die getValue() - Methode hat ein Fehler produziert.");
        if (removeTest()) System.out.println("Die remove() - Methode hat ein Fehler produziert.");
//        if (removeValueTest()) System.out.println("Die removeValueTest() - Methode hat ein Fehler produziert.");
    }

    private boolean addTest() {
        boolean ergAddValueTest = false;
        this.zug.add(this.eins);
        this.zug.add(this.zwei);
        if (this.zug.size() != 2) ergAddValueTest = true;
        this.zug.add(this.drei);
        this.zug.add(this.vier);
        this.zug.add(this.fuenf);
        this.zug.add(this.sechs);
        this.zug.add(this.sieben);
        System.out.println("Direkter Vergleich: ");
        for (int i = 0; i < 7; i++) {
            if (this.zug.get(i) != this.array[i]) ergAddValueTest = true;
            System.out.println(this.zug.get(i));
            System.out.println(this.array[i]);
        }
        return ergAddValueTest;
    }

    //  public boolean insertTest() {
    //      boolean ergInsertTest = true;
    //         return ergInsertTest;
    //    }

    private boolean insertTest() {
        boolean ergInsertValueTest = false;

        return ergInsertValueTest;
    }

//    private boolean getValueTest() {
    //      boolean ergGetValueTest = true;
//
    //      return ergGetValueTest;
    //}

    private boolean removeTest() {
        boolean ergRemoveTest = false;

        return ergRemoveTest;
    }
}
