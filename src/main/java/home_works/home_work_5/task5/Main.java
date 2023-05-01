package home_works.home_work_5.task5;

public class Main {
    public static void main(String[] args) {
        Record huberskyi = new Record("Volodymyr", "+380971551666");
        Record albon = new Record("Alex", "+380501551777");
        Record verstappen = new Record("Max", "+380971551888");
        Record vettel = new Record("Sebastian", "+380951551555");
        Record alonso = new Record("Fernando", "+380961551333");
        Record rins = new Record("Alex", "+380991551334");

        Record[] persons = {huberskyi, albon, verstappen, vettel, alonso, rins};
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        for (Record record : persons) {
            phoneDirectory.add(record);
        }

        System.out.println();
        System.out.println(phoneDirectory.find("Alex") + "\n");

        for (Record record : phoneDirectory.findAll("Alex")) {
            System.out.println(record);
        }
    }
}
