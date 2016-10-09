/**
 * Created by doetken on 14.09.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Testklasse tester = new Testklasse();
        tester.test();
    }

//
//    private static void test() {
//        Lok testZug = new Lok();
//
//
//        Object eins = new String("Erster");
//        Object zwei = new String("Zweiter");
//        Object drei = new String("Dritter");
//        Object vier = new String("Vierter");
//        Object fuenf = new String("Fünfter");
//        Object sechs = new String("Sechster");
//        Object sieben = new String("Siebter");
//
////        Testet addValue
//        try {
//            testZug.addValue(eins);
//            testZug.addValue(zwei);
//            testZug.addValue(drei);
//            testZug.addValue(vier);
//            testZug.addValue(fuenf);
//            testZug.addValue(sechs);
//            testZug.addValue(sieben);
//        } catch (IndexOutOfBoundsException e1) {
//            System.out.println("Anlegen der Testwaggons hat nicht geklappt");
//        }
//        System.out.println("Größe: " + testZug.size());
//        System.out.println("Position 2: " + testZug.getValue(2) + " (müsste Zweiter sein)");
//
////        testZug.remove(0);
////        System.out.println("neue Position 1: " + testZug.getValue(0) + " (müsste Zweiter sein)");
//
//
//        try {
//            testZug.removeValue(drei);
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }
//        System.out.println("neue Position 4: " + testZug.getValue(4) + " (müsste Fünfter sein)");
//
//    }
}
