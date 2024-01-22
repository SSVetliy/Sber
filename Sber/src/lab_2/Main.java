package lab_2;

import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[10];

        arr[0] = "Привет";
        arr[1] = "Пока";
        arr[2] = "привет";
        arr[3] = "Нет";
        arr[4] = "Да";
        arr[5] = "алло";
        arr[6] = "Здрасте";
        arr[7] = "Нееее";
        arr[8] = "нет";
        arr[9] = "Пока";

        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String str : arr){
            String temp = str.toLowerCase().trim();
            if(hashMap.containsKey(temp))
                hashMap.put(temp, hashMap.get(temp) + 1);
            else
                hashMap.put(temp, 1);
        }

        for(String key : hashMap.keySet())
            System.out.println("Слово - " + key + ", встретилось - " + hashMap.get(key) + " раз");

        System.out.println("=============================================================================================");

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "89187777777");
        phoneBook.add("Смирнов", "89188888888");
        phoneBook.add("Соболев", "891899999999");
        phoneBook.add("Иванов", "891811111111");
        phoneBook.add("Иванов", "891811111111");

        phoneBook.get("Соболев");
        System.out.println();
        phoneBook.printAll();
    }
}

class PhoneBook {
    HashMap<String, TreeSet<String>> hashMap;

    public PhoneBook(){
        hashMap = new HashMap<>();
    }

    public void add(String name, String phone){
        if(hashMap.containsKey(name))
            hashMap.get(name).add(phone);
        else
            hashMap.put(name, new TreeSet<>(){{add(phone);}});
    }

    public void printAll(){
        for(String key : hashMap.keySet())
            System.out.println(key + "    " + hashMap.get(key));
    }

    public void get(String key){
        System.out.println(key + "    " + hashMap.get(key));
    }
}
