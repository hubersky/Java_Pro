package home_works.home_work8;

import java.util.*;

public class FileNavigator {

    Map<String, List<FileData>> groupFiles = new HashMap<>();

    public void add(String path, FileData file) {
        if (!path.equals(file.getPath())) {
            System.out.println("This path doesn't match the file path");
        }
        if (groupFiles.containsKey(path)) {
            List<FileData> files = groupFiles.get(path);
            files.add(file);
            groupFiles.put(path, files);
        }
        if (!groupFiles.containsKey(path)) {
            List<FileData> files = new LinkedList<>();
            files.add(file);
            groupFiles.put(path, files);
        }
    }

    public List<FileData> find(String path) {
        return groupFiles.get(path);
    }

    public List<FileData> filterBySize(int size) {
        List<FileData> filesBySize = new LinkedList<>();
        for (Map.Entry<String, List<FileData>> files : this.groupFiles.entrySet()) {
            for (FileData file : files.getValue()) {
                if (file.getSize() <= size) filesBySize.add(file);
            }
        }
        return filesBySize;
    }

    public void remove(String path) {
        groupFiles.remove(path);
    }

    public List<FileData> sortBySize() {
        List<FileData> sortedFiles = new LinkedList<>();
        for (Map.Entry<String, List<FileData>> files : this.groupFiles.entrySet()) {
            sortedFiles.addAll(files.getValue());
        }
        sortedFiles.sort(Comparator.reverseOrder());
        return sortedFiles;
    }
}
