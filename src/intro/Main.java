package intro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // listy, zbiory, kolejki, mapy

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        linkedList.add("ma");
        linkedList.add(0, "Ala");
        linkedList.add("3");
        linkedList.add("Koty");
        linkedList.add("Ala");

        System.out.println(linkedList);
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.size());
        System.out.println(linkedList.indexOf("Ala"));
        System.out.println(linkedList.lastIndexOf("Ala"));
        System.out.println(linkedList.contains("kota"));
        linkedList.remove(2);
        linkedList.remove("Ala");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList);

        for (String s : linkedList)
            System.out.println(s);

        arrayList.addAll(linkedList);
        System.out.println(arrayList);

        Set<String> stringSet = new HashSet<>();

        stringSet.add("Ala");
        stringSet.add("kot");
        stringSet.add("Ala");

        System.out.println(stringSet);
        System.out.println(stringSet.isEmpty());
        System.out.println(stringSet.size());
        System.out.println(stringSet.contains("Ala"));
        stringSet.remove("kot");
        System.out.println(stringSet);
//        stringSet.clear();

        for (String s : stringSet)
            System.out.println(s);

        Map<String, String> miastaPanstwa = new HashMap<>();

        miastaPanstwa.put("Warszawa", "Polska");
        miastaPanstwa.put("Ełk", "Polska");
        miastaPanstwa.put("Poznań", "Polska");
        miastaPanstwa.put("Częstochowa", "Polska");
        miastaPanstwa.put("Berlin", "Niemcy");
        miastaPanstwa.put("Paryż", "Francja");

        System.out.println(miastaPanstwa);
        System.out.println(miastaPanstwa.get("Ełk"));
        System.out.println(miastaPanstwa.getOrDefault("asd", "N/D"));
        System.out.println(miastaPanstwa.size());
        System.out.println(miastaPanstwa.isEmpty());
        System.out.println(miastaPanstwa.containsKey("Warszawa"));
        System.out.println(miastaPanstwa.containsValue("Dania"));
        miastaPanstwa.remove("Poznań");
        miastaPanstwa.remove("Warszawa", "Polska");

        System.out.println(miastaPanstwa);

        for (String k : miastaPanstwa.keySet())
            System.out.println(k);

        for (String v : miastaPanstwa.values())
            System.out.println(v);

        for (Map.Entry<String, String> entry : miastaPanstwa.entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());


    }

}
