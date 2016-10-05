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

    public Testklasse() {
    }

    public void test() {

        addValueTest();
    }

    public boolean addValueTest() {
        boolean ergAddValueTest = true;
        this.zug.addValue(this.eins);
        this.zug.addValue(this.zwei);
        if (this.zug.size() != 2) {
            ergAddValueTest = false;
        }
        return ergAddValueTest;
    }
}
