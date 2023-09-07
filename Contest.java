import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Contest {

    public static void main(String[] args) {
        String ProductInfo = "ProductInfo.csv";
        String[][] ProductInfoArray = readCSVFileToArray(ProductInfo);

        String Day_1_Purchase_History = "Day_1_Purchase_History.csv";
        String[][] Day1_Array = readCSVFileToArray(Day_1_Purchase_History);

        String Day_2_Purchase_History = "Day_1_Purchase_History.csv";
        String[][] Day2_Array = readCSVFileToArray(Day_2_Purchase_History);

        String Day_3_Purchase_History = "Day_1_Purchase_History.csv";
        String[][] Day3_Array = readCSVFileToArray(Day_3_Purchase_History);

        String Day_4_Purchase_History = "Day_1_Purchase_History.csv";
        String[][] Day4_Array = readCSVFileToArray(Day_4_Purchase_History);

        public static String buyArray(String[][] arr ){
            int count = 0;
            for (int j = 1; j < arr[0].length; i++) {
                if(arr[4][j]!=NULL){

                }                
            }
        }        




    }

    public static void printStringArray(String arr[][]){
        for (String[] row : arr) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
        
    }

    private static String[][] readCSVFileToArray(String filePath) {
        List<String[]> dataList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                dataList.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList.toArray(new String[0][]);
    }
}
