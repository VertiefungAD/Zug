/**
 * Created by doetken on 05.10.2016.
 */
public class Testklasse {

    private Lok zug = new Lok();
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
        if (addValueTest())
            System.out.println("Die addValue() - Methode oder die size() - Methode hat ein Fehler produziert.");
//        if (insertTest()) System.out.println("Die insert() - Methode hat ein Fehler produziert.");
        if (insertValueTest()) System.out.println("Die insertValue() - Methode hat ein Fehler produziert.");
//        if (getValueTest()) System.out.println("Die getValue() - Methode hat ein Fehler produziert.");
        if (removeTest()) System.out.println("Die remove() - Methode hat ein Fehler produziert.");
        if (removeValueTest()) System.out.println("Die removeValueTest() - Methode hat ein Fehler produziert.");
    }

    private boolean addValueTest() {
        boolean ergAddValueTest = false;
        this.zug.addValue(this.eins);
        this.zug.addValue(this.zwei);
        if (this.zug.size() != 2) ergAddValueTest = true;
        this.zug.addValue(this.drei);
        this.zug.addValue(this.vier);
        this.zug.addValue(this.fuenf);
        this.zug.addValue(this.sechs);
        this.zug.addValue(this.sieben);
        System.out.println("Direkter Vergleich: ");
        for (int i = 0; i < 6; i++) {
            if (this.zug.getValue(i) != this.array[i]) {
                ergAddValueTest = true;
            }
            System.out.println(this.zug.getValue(i));
            System.out.println(this.array[i]);
        }
        return ergAddValueTest;
    }

    //  public boolean insertTest() {
    //      boolean ergInsertTest = true;
    //         return ergInsertTest;
    //    }

    private boolean insertValueTest() {
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

    private boolean removeValueTest() {
        boolean ergRemoveValueTest = false;

        return ergRemoveValueTest;
    }
}