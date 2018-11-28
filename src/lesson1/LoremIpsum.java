package lesson1;

import java.io.*;

public class LoremIpsum {
    public static void main(String[] args) {
        File filteredFile = new File("filtered_lorem_ipsum.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter(filteredFile));
            while(reader.ready()) {
                String line = reader.readLine();
                String[]words  = line.split("\\s");
                //print(words); // get off comments to check words in an array;
                for (int i = 0; i < words.length ; i++) {
                    if(words[i].length() > 3){
                        writer.write(words[i] + " ");
                    }
                }
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void print(String[] mas) {
        for (int i = 0; i < mas.length ; i++) {
            System.out.println(mas[i]+" ");
        }
    }
}
