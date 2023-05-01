package home_works.home_work_5.task5;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
    private List<Record> records = new ArrayList<>();

    public void add(Record record) {
         records.add(record);
    }

    public Record find(String name) {
        for (Record record: records) {
            if (record.getName().equals(name)){
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> returnRecord = new ArrayList<>();
        for (Record record: records) {
            if (record.getName().equals(name)){
                returnRecord.add(record);
            }
        }
        return returnRecord;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
