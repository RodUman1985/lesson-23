package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// HashSet -  коллекция клторая хранит уникальные значения
        // коллекции типа Hash** при сравнении элементов вначале  выызвается метод equalse, и только потом hash - код
        //
   /*     HashSet <String> set = new HashSet<>();
        set.add("Imperor");
        set.add("protects!!!");
        set.add("Imperor");
        set.add("protects!!!");
        System.out.println(set);
        HashSet <Cat> cats = new HashSet<>();
        Cat cat1=new Cat();
        Cat cat2=new Cat();
        cat1.id=1;
        cat1.name="Gav";
        cat2.name="Gav";
        cat2.id=11;
        cats.add(cat1);
        cats.add (cat2);
        System.out.println(cats);
        // HashMap (Dictionary)
        // key: value
        // key - должен быть уникаленю value -  может повторяться
        HashMap<Integer,String> phones= new HashMap<>();
         // добавление элементов
        phones.put(3200,"Tolian");
        phones.put(1200, "Vovan");
        phones.put (7301, "Andon");
        System.out.println(phones);
        // Проверка сущетсо=вования ключа в коллекции
        System.out.println( phones.containsKey(1200));
        System.out.println (phones.containsKey(7200));
        // проверка существования значения в коллекции
        System.out.println(phones.containsValue("Vovan"));
        System.out.println(phones.containsValue("vovan"));
        // получение списка ключей
        Set<Integer> keys= new HashSet<>( phones.keySet());
        System.out.println(keys);
        //получение списка значений
        System.out.println(phones.values());
        // получение значения по ключу
        System.out.println(phones.get(1200));
        System.out.println(phones.get(2200));
        System.out.println(phones.getOrDefault(2200,"Ops!!"));
        System.out.println(phones.getOrDefault(1200,"Ops!!"));
        // Удаление значений
        phones.remove(1200);
        phones.remove(3200,"Tolian");
        System.out.println(phones);
        // дана строка произвольной длинны, содержащая только латинские символы.
        // вывести на экран количество повторений каждого символа в строке
        String s= "kpokpokpo";
        HashMap<Character,Integer> chars = new HashMap<>();
        for(char c: s.toCharArray()){
            chars.put(c,chars.getOrDefault(c,0)+1);
                    }
        System.out.println(chars);*/
        // создание своей коллекции
       TenetList<Integer> tList = new TenetList<>();
        tList.add(1);
        tList.add(2);
        tList.add(3);
        tList.add(4);
        tList.add(5);
        tList.add(6);
        tList.add(7);
        tList.add(8);
        tList.add(9);
        tList.add(10);
        System.out.println(tList);
        for(int i=0;i < tList.size();i++){
            System.out.print("  "+tList.get(i));
        }
        System.out.println();
        System.out.println("_______________________________________________");
        // при старте, цикл for Ech вызывает у  объекта коллекции метод Iterator
        for(int e:tList){
            System.out.print("  "+e);
        }
        System.out.println();
        System.out.println("-----------------------------------------------");
        // сортировка коллекций
      LinkedList<Cat> catList = new LinkedList<>();
      catList.add( new Cat(1, "Nik"));
        catList.add( new Cat(2, "Tom"));
        catList.add( new Cat(3, "Kik"));
        catList.add( new Cat(4, "Pik"));
        Collections.sort(catList);
        System.out.println(catList);
        Collections.sort(catList,new Cat.CateratorName());
        System.out.println(catList);
        Collections.sort(catList,new Cat.CateratorID());
        System.out.println(catList);
        Collections.sort(catList,new Cat.CateratorID(false));
        System.out.println(catList);
    }
}
