import java.util.Arrays;
import java.util.Comparator;

public class SortFile {

    public static int k = 0; //счетчик для нахлждения повторяющихся строк в столбце

    //Сортировка
    public static void sort() {
        final ReadFile readFile = new ReadFile();
        String[] temp = new String[readFile.rows];
        boolean test = true;

        while (test) {

            for (int i = 0; i < temp.length; i++) {
                temp[i] = readFile.matrix[i][k];
            }

            for (int i = 1; i < temp.length; i++) {
                if (temp[i - 1].equals( temp[i] )) {
                    k++;
                    break;
                }
            }

            Arrays.sort( readFile.matrix, new Comparator<String[]>() {
                public int compare(final String[] first, final String[] second) {
                    final String f = first[k];
                    final String s = second[0];
                    return f.compareTo(s);
                }
            } );

            System.out.println("");
            for (int i = 0; i < readFile.rows; i++) {
                for (int j = 0; j < readFile.cols; j++) {
                    System.out.print( readFile.matrix[i][j] + " " );
                }
                System.out.println( "" );
            }

            if (k < readFile.rows) {
                test = false;
                break;
            }

        }
    }
}


