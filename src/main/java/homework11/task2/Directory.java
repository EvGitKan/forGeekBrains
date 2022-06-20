package homework11.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Directory {
    private Map<String, List<String>> directoryPhone = new HashMap<>();
    private List<String> phoneNumberList;

    public void add(String surname, String phoneNumber) {
        if (directoryPhone.containsKey(surname)) {
            phoneNumberList = directoryPhone.get(surname);
            phoneNumberList.add(phoneNumber);
            directoryPhone.put(surname, phoneNumberList);
        } else {
            phoneNumberList = new ArrayList<>();
            phoneNumberList.add(phoneNumber);
            directoryPhone.put(surname, phoneNumberList);
        }
    }

    public List<String> get(String surname) {
        return directoryPhone.get(surname);
    }

}