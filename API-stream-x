package br.com.bio.collection.streamAPI;


import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class APIExStream {

    public static void main(String[] args) {
        List<String> randomNumbers  =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

//        System.out.println("Print all this elements in that String:  ");
//        randomNumbers.stream()
//                 .forEach(System.out::println);
//        randomNumbers.forEach(System.out::println);

//        System.out.println(" Take all the 5 numbers and get inside on that Set:");
//        randomNumbers.stream()
//                .limit(5)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);
//        Set<String> randomNumbers5First = randomNumbers.stream()
//                .limit(5)
//                .collect(Collectors.toSet());
//        System.out.println(randomNumbers5First);

//        System.out.println("Change this list of String on list of the integer numbers.");
//        List<Integer> randomNumbers1 = randomNumber.stream() 
//                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> randomNumbersInteger = randomNumbers.stream() 
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //.forEach(System.out::println);


//        System.out.println("Take even numbers greater than 2 and put them in a list:");
//        randomNumbers.stream() 
//                .map(Integer::parseInt)
//                .filter(i -> i % 2 == 0 && i > 2)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);
//        List<Integer> listEvenGreater2 = randomNumbers.stream()
//                .map(Integer::parseInt)
//                .filter(i -> (i % 2 == 0 && i > 2))
//                .collect(Collectors.toList());
//        System.out.println(listGreater2);

//        System.out.println("Show the average of the numbers: ");
//        randomNumbers1.stream()
//                .average()
//                .ifPresent(System.out::println);
//        randomNumbers.stream()
//                .mapToInt(Integer::parseInt)
//                .average()
//                .ifPresent(System.out::println);

//        System.out.println("Remove the odd values: ");
//        randomNumbers1.removeIf(integer -> integer % 2 != 0);
//        System.out.println(randomNumbers1);
//        randomNumbersInteger.removeIf(i -> (i % 2 != 0));
//        System.out.println(randomNumbersInteger);

//     
        System.out.println("Ignore the first 3 elements of the list and print the rest:");
        radomNumbersInteger.stream()
                .skip(3)
                .forEach(System.out::println);

        long countUniqueNumbers = randomNumbers Integer.stream()
                .distinct()
                .count();
        System.out.println("Removing the repeated numbers from the list, how many numbers are left? " + countUniqueNumbers
        System.out.print("Show the smallest value from the list: ");
        randomNumbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .ifPresent(System.out::println);

        System.out.print("Show the highest value in the list: ");
        randomNumbersInteger.stream()
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);;

        int addallEvenNumbers = randomNumbersInteger.stream()
                .filter(i -> (i % 2 == 0))
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Take only the odd numbers and add them up: " + addallEvenNumbers);

        System.out.println("Show the list in numerical order: ");
        List<Integer> numbersNaturalOrder = randomNumbersInteger.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(numbersNaturalOrder);

        System.out.println("Group odd values multiples of 3 or 5:");
//        dica: collect(Collectors.groupingBy(new Function())
        Map<Boolean, List<Integer>> collectNumbersMultiplesof3and5 = randomNumbersInteger.stream()
                .collect(Collectors.groupingBy(i -> (i % 3 == 0 || i % 5 == 0)));
        System.out.println(collectNumbersMultiplesof3and5);
    }
}

