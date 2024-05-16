package Boss.File_Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        // String test = "Some test string , Patthadol Raksapram ,";
        // String[] data = test.split(",");
        // for (String s : data) {
        // System.out.println(s.trim());
        // }

        FileReader in = new FileReader(
                "C:\\Users\\Patthadol Raksapram\\Desktop\\Advance_Java_Workshop_2\\File_Reader\\trial_dataENG.csv");
        try (BufferedReader reader = new BufferedReader(in)) {
            Stream<String> lines = reader.lines().skip(1); // skip the header
            List<Item> list = new ArrayList<>();
            lines.forEach(data -> {
                String[] line = data.split(",");
                // for (String s : line) {
                // System.out.println(s.trim());
                // }
                // New Item object
                Item item = new Item(
                        line[0].trim(),
                        line[1].trim(),
                        line[2].trim(),
                        line[3].trim(),
                        line[4].trim(),
                        line[5].trim(),
                        Float.valueOf(line[6].trim()));
                list.add(item);
            });

            list.stream().forEach((Item item) -> {
                System.out.println(item.getReactionTime());
            });
        }
    };
}
