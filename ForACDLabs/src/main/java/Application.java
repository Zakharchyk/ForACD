public class Application {
    public static void main(String[] args) {

        ReadFile readFile = new ReadFile();
        SortFile sortFile = new SortFile();

        readFile.fromFile();
        SortFile.sort();
        readFile.inFile();
    }
}
