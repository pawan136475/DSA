package coding_problems.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Filter even numbers from a list.
public class Code_1 {

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5);

        List<Integer> integers2 = Arrays.asList(1, 7, 8, 9, 5, 5);
        List<String> names = Arrays.asList("john", "alex", "bob", "john");

        List<Integer> evenNumbers = integers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        //System.out.println(evenNumbers);

        //Convert all strings to uppercase.
        names.stream().map(n -> n.toUpperCase()).forEach(System.out::println);

        //Find the maximum number.
        Optional<Integer> max = integers.stream().max(Integer::compareTo);
        //System.out.println(max.get());

        //Find the minimum number.
        Optional<Integer> min = integers.stream().min(Integer::compareTo);
        //System.out.println(min.get());

        //Count elements.
        long countVal = integers.stream().count();
        //System.out.println(countVal);

        //Remove duplicates.
        integers.stream().distinct().forEach(System.out::println);

        //Sort a list.
        List<Integer> val = integers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(val);

        //Find duplicate elements.

        Set<Integer> set = new HashSet<>();
        List<Integer> val2 = integers.stream().filter(n -> !set.add(n)).collect(Collectors.toList());

        System.out.println("val2-" + val2);

        //Find the first non-repeating character.

        String s = "aabbcdde";
        Character result = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println("first non-repeating character- " + result);

        //Count frequency of each character.

        s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().forEach(System.out::println);

        //Count frequency of words.
        names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((key, value) -> System.out.println(key + "->" + value));

        //Reverse a string using streams.
        String reversed = IntStream.range(0, s.length()).mapToObj(i -> String.valueOf(s.charAt(s.length() - 1 - i))).collect(Collectors.joining());
        System.out.println("reversed-" + reversed);

        //Join strings with commas.
        String commas = s.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining(","));
        System.out.println("commas-" + commas);

        //Partition even and odd numbers.
        integers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0)).forEach((key, value) -> System.out.println(key + "->" + value));

        //Find common elements of two lists.
        List<Integer> commonElements = integers.stream().filter(integers2::contains).collect(Collectors.toList());
        System.out.println("commonElements- " + commonElements);
    }
}
