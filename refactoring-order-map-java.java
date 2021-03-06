package br.com.j.collection.streamAPI;

import br.com.j.collection.map.exerciseProposal12.Contato;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

/*Given the following id and contact information, create a dictionary and
sort this dictionary by displaying (Name id - Name contact);
id = 1 - Contact = name: Sam, number: 2222;
id = 4 - Contact = nome: Com, numero: 5555;
id = 3 - Contact = name: Lau, number: 1111;
*/
public class OrderingRefactoringMap {

    public static void main(String[] args) {
        System.out.println("--\t Random order \t--");
        Map<Integer, Contact> agenda = new HashMap<>() {{
           put(1, new Contact("Sam", 5555));
           put(4, new Contato("Com", 1111));
           put(3, new Contato("Lau", 2222));
        }};
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Insertion\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {{
            put(1, new Contato("Sam", 5555));
            put(4, new Contato("Com", 1111));
            put(3, new Contato("Lau", 2222));
        }};
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry: agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contact> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry: agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrder phone number \t--");
        //we need to organize the values. So: 
        /*Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(new Comparator<Map.Entry<Integer, Contact>>() {
            @Override
            public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
                return Integer.compare(cont1.getValue().getNumber(), cont2.getValue().getNumber());
            }
        });*/

        /*Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(Comparator.comparing(
                new Function<Map.Entry<Integer, Contact>, Integer>() {
                    @Override
                    public Integer apply(Map.Entry<Integer, Contact> cont) {
                        return cont.getValue().getNumber();
                    }
                }));*/

        Set<Map.Entry<Integer, Contact>> set = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getNumero()));
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contact> entry: set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumber() +
                    ": " +entry.getValue().getName());
        }

        System.out.println("--\tOrder name contact\t--");
        //we need to organize the values. So:
        Set<Map.Entry<Integer, Contact>> set1 = new TreeSet<>(Comparator.comparing(
                cont -> cont.getValue().getName()));
        set1.addAll(agenda.entrySet());
        //print using forEach
        set1.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue().getName()));
    }
}

/*class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer, Contato>> {
    @Override
    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumber());
    }
}*/

/*class ComparatorNumericalOrder implements Comparator<Map.Entry<Integer, Contact>> {
    @Override
    public int compare(Map.Entry<Integer, Contact> cont1, Map.Entry<Integer, Contact> cont2) {
        return cont1.getValue().getName().compareToIgnoreCase(cont2.getValue().getName());
    }
}*/
