/**
 * Created by doetken on 14.09.2016.
 */
public class Runner {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Lok testZug = new Lok();

        Object eins = new String("Erster");
        Object zwei = new String("Zweiter");
        Object drei = new String("Dritter");
        Object vier = new String("Vierter");

        testZug.addValue(eins);
        testZug.addValue(zwei);
        testZug.addValue(drei);
        testZug.addValue(vier);

        System.out.println("Größe: " + testZug.size());
        System.out.println("Position 2: " + testZug.getValue(2) + " (müsste Zweiter sein)");

        testZug.remove(2);
        System.out.println("neue Position 2: " + testZug.getValue(2) + " (müsste Zweiter sein)");


        testZug.removeValue(drei);
        System.out.println("neue Position 2: " + testZug.getValue(2) + " (müsste Vierter sein)");

    }
}
