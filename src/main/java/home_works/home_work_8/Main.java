package home_works.home_work_8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FileData> carsInfo = List.of(new FileData("Cars", 12, "/path/cars"),
                new FileData("Wheels", 8, "/path/cars"),
                new FileData("Interiors", 4, "/path/cars"),
                new FileData("Engines", 6, "/path/cars"));
        List<FileData> carOwners = List.of(new FileData("Owners", 2, "/path/data"),
                new FileData("Address", 4, "/path/data"),
                new FileData("Assurance", 10, "/path/data"));

        FileNavigator fileNavigator = new FileNavigator();
        for (FileData file : carsInfo) {
            fileNavigator.add("/path/cars", file);
        }
        for (FileData file : carOwners) {
            fileNavigator.add("/path/data", file);
        }

        fileNavigator.add("/path/cars", new FileData("Gears", 7, "/path/cars"));

        for (FileData file : fileNavigator.filterBySize(6)) {
            System.out.println(file.toString());
        }
        System.out.println();

        for (FileData file : fileNavigator.find("/path/cars")) {
            System.out.println(file);
        }

        fileNavigator.remove("/path/data");
        System.out.println();

        for (FileData file : fileNavigator.sortBySize()) {
            System.out.println(file);
        }
    }
}
