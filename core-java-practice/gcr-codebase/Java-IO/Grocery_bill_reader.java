import java.io.*;

public class Main {
    public static void main(String[] args) {
        int count = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("bill.txt"));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }

            br.close();

            System.out.println("Total Lines = " + count);

        } catch (FileNotFoundException e) {
            System.out.println("bill.txt not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}