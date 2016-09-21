/**
 * Created by doetken on 14.09.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Lok zug1 = new Lok();
        zug1.addValue("Kohle_1");
        zug1.addValue("Oel_2");
        zug1.addValue("Test_3");
        System.out.println(zug1.getValue(0));
         System.out.println(zug1.size());

        String[] testArray = {"Kohle_1", "Oel_2", "Test_3"};

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
}
