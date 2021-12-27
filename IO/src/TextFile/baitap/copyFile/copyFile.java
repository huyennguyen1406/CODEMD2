package TextFile.baitap.copyFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class copyFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public void CopyFile(String filePath, List<Integer> numbers) {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                throw new FileNotFoundException();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fw);

            for (Integer integer : numbers) {
                System.out.println(integer);
                bufferedWriter.write(integer + "\n");
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("File already exist");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        copyFile readAndWriteFile = new copyFile();
        List<Integer> numbers = readAndWriteFile.readFile("F:\\CODEMD2\\IO\\src\\TextFile\\baitap\\copyFile\\source");
        readAndWriteFile.CopyFile("F:\\CODEMD2\\IO\\src\\TextFile\\baitap\\copyFile\\results", numbers);
    }
}