import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadFile {  //Класс для работы с файлом

    public static String [][] matrix = null; // двумерный массив для хранения таблицы из файла
    public static int rows = 0;
    public static int cols = 0;

    //Чтение из файла
    public static void fromFile(){
        try {
            FileReader fileReader = new FileReader( "C:\\Users\\HP\\Desktop\\ForACDLabs\\src\\main\\java\\file.txt" );
            Scanner scanner = new Scanner(fileReader);

            //Задаем количесво строк и столбцов
            rows = scanner.nextInt();
            cols = scanner.nextInt();
            matrix = new String[rows][cols];

            //Считываем таблицу
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    matrix[i][j] = scanner.next();
                }
            }


            //Вывод изначальной таблицы
            for(int i=0;i<rows;i++){
               for(int j=0;j<cols;j++){
                  System.out.print(matrix[i][j]+" ");
                }
                System.out.println("");
            }

            scanner.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        }

        //Запись в файла
    public static void inFile(){
        try {
            File file = new File("C:\\Users\\HP\\Desktop\\ForACDLabs\\src\\main\\java\\out.txt");
            PrintWriter printWriter = new PrintWriter(file);
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    printWriter.print( matrix[i][j]+" ");
                }
                printWriter.println("");
            }
        printWriter.close();
            System.out.println("Запись в новый файл прошла успешно!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
