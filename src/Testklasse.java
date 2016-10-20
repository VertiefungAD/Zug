/**
 * Created by doetken on 05.10.2016.
 */
public class Testklasse {

    public Testklasse() {
    }

    public void test() {
        if (!test1()) {
            System.out.println("Test 1 ist schief gelaufen!");
        }
        if (!test2()) {
            System.out.println("Test 2 ist schief gelaufen!");
        }
        if (!test3()) {
            System.out.println("Test 3 ist schief gelaufen!");
        }
    }

    private boolean test1() {
        String[] array = {"Erster", "Zweiter", "Dritter", "Vierter", "Fünfter", "Sechster", "Siebter"};
        List<String> zug = new List();
        String eins1 = new String("Erster");
        String zwei1 = new String("Zweiter");
        String drei1 = new String("Dritter");
        String vier1 = new String("Vierter");
        String fuenf1 = new String("Fünfter");
        String sechs1 = new String("Sechster");
        String sieben1 = new String("Siebter");
        boolean ergAddValueTest = false;
        zug.add(eins1);
        zug.add(zwei1);
        if (zug.size() != 2) ergAddValueTest = true;
        zug.add(drei1);
        zug.add(vier1);
        zug.add(fuenf1);
        zug.add(sechs1);
        zug.add(sieben1);
        for (int i = 0; i < 7; i++) {
            if (zug.get(i) != array[i]) ergAddValueTest = true;
        }
        return ergAddValueTest;
    }

    private boolean test2() {
        boolean ergInsertValueTest = false;
        String[] array = {"Erster", "Zweiter", "Dritter", "Vierter"};
        List<String> zug = new List();
        String eins2 = new String("Erster");
        String zwei2 = new String("Zweiter");
        String drei2 = new String("Dritter");
        String vier2 = new String("Vierter");
        zug.add(eins2);
        zug.add(zwei2);
        zug.add(drei2);
        zug.add(vier2);
        String neu = "Neuer";
        zug.add(1, neu);
        if (zug.get(1) != neu) {
            ergInsertValueTest = true;
        }
        return ergInsertValueTest;
    }

    private boolean test3() {
        boolean ergRemoveTest = false;
        String[] array = {"Erster", "Zweiter", "Dritter", "Vierter"};
        List<String> zug = new List();
        String eins3 = new String("Erster");
        String zwei3 = new String("Zweiter");
        String drei3 = new String("Dritter");
        String vier3 = new String("Vierter");
        zug.add(eins3);
        zug.add(zwei3);
        zug.add(drei3);
        zug.add(vier3);
        zug.remove(1);
        if (zug.get(1) != "Zweiter") {
            ergRemoveTest = true;
        }

        zug.remove("Zweiter");
        if (zug.get(2) != "Dritter") {
            ergRemoveTest = true;
        }
        return ergRemoveTest;
    }
}
