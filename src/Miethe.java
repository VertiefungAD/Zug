public class Miethe {


    public static void main(String[] args) {

        if (test1()) {
            System.out.println("Test1: true");
            if (test2()) {
                System.out.println("Test2: true");
                if (test3()) {
                    System.out.println("Test3: true");
                } else System.out.println("Großer Fehler Test3");
            } else System.out.println("Großer Fehler Test2");
        } else System.out.println("Großer Fehler Test1");

    }


    private static boolean test1() {        //Prüft Größe und Inhalt einer Lok
        boolean checker = false;

        List<String> myLok = new List<>();

        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = "Hallo" + i;
            myLok.add(array[i]);
        }

        if (array.length == myLok.size()) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == myLok.get(i)) {
                    checker = true;
                } else {
                    checker = false;
                }
            }
            return checker;
        } else return false;
    }

    private static boolean test2() {        //Prüft, ob an der richtigen Position die Wagons hinzugefügt wurden
        boolean checker = false;

        List<String> myLok = new List<>();

        myLok.add("0");
        myLok.add("1");
        myLok.add("2");
        myLok.add("3");
        myLok.add("4");
        myLok.add("5");
        myLok.add("6");
        myLok.add("7");

        myLok.add(0, "Hallo" + 0);
        myLok.add(3, "Hallo" + 3);
        myLok.add(7, "Hallo" + 7);

        if (myLok.get(0) == "Hallo" + 0) {
            checker = true;
            if (myLok.get(3) == "Hallo" + 3) {
                checker = true;
                if (myLok.get(7) == "Hallo" + 7) {
                    checker = true;
                } else checker = false;
            } else checker = false;
        } else checker = false;

        return checker;
    }

    private static boolean test3() {            //Prüft, ob an der richtigen Position die Wagons und ob alle identischen Objekte der Lok entfernt wurden
        List<String> myLok = new List<>();

        myLok.add("0");
        myLok.add("1");
        myLok.add("2");
        myLok.add("3");


        //Prüft, ob an der richtigen Position die Wagons entfernt wurden
        String s = myLok.get(3); //Merke Inhalt von Wagon 3 in einen neuen Wagon w
        myLok.remove(2);                        //entferne den Wagon 3 aus der Lok


        if (myLok.get(2) == s) {    //Prüft ob nun an Pos 2 nun der Wagon 3 steht
            return true;
        } else {
            myLok.remove("Mein Objekt");        //Dieser Test muss noch mit dem obigen in einer If verbaut werden, so dass geprüft wird, ob ein Int oder ein Object entfernt wird. (Instanceof)

            for (int i = 0; i < myLok.size(); i++) {
                if (myLok.get(i) == "Mein Objekt") {
                    return false;
                } else return true;
            }
        }

        //Prüft, ob alle identischen Objekte der Lok entfernt wurden

        //Hier muss noch durch die gesamte Lok iteriert werden und das bestimmte zutreffende Objekt überall entfernt werden
        //anschließend muss nochmal iteriert werden und geprüft werden, ob das bestimmte Objekt nicht mehr vorkommt

        return false;
    }
}
