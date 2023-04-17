package home_works.home_work10;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Parser {

    public void findBook() {
        System.out.print("Please enter the book name: ");
        Scanner scanner = new Scanner(System.in);
        String nameOfBook = scanner.nextLine();
        scanner.close();
        readBook(nameOfBook);
    }

    public void readBook(String nameOfBook) {
        try (BufferedReader reader = new BufferedReader(new FileReader(String.format("src/%s.txt", nameOfBook)))) {
            Scanner scanner = new Scanner(reader);
            List<String> content = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String[] text = scanner.nextLine().replaceAll("\\W", " ").split(" ");
                content.addAll(Arrays.asList(text));
            }
            scanner.close();
            writeStatistic(countWord(content));
        } catch (IOException ex) {
            System.out.println("Book doesn't exist!");
        }
    }

    public Map<String, Integer> countWord(List<String> content) {
        int countUniqueWord = (int) content.stream().distinct().count();
        Map<String, Integer> countWord = content.stream()
                .filter(x -> x.length() > 2)
                .collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        countWord = countWord.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
        countWord.put("Total number of unique words:", countUniqueWord);
        countWord.forEach((k,v)-> System.out.println(k + " " + v));
        return countWord;
    }

    public void writeStatistic(Map<String, Integer> content) {
        try {
            FileWriter writer = new FileWriter("src/statistic.txt");
            for (Map.Entry<String, Integer> word: content.entrySet()) {
                writer.write(word.getKey() + " " + word.getValue() + "\n");
                writer.flush();
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
