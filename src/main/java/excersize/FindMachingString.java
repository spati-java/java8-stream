package excersize;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindMachingString {

    public static void main(String[] args) {

        String[] strings = {"abc", "ab", "bc", "abc"};
        String[] queries = {"abc", "dc", "ab", "bc", "ca", "ba"};
        



    }

   static SearchString result = ( String [] strings1, String[] queries1) -> {
        List<String> stringsList = Arrays.asList(strings1);
        List<String> queriesList = Arrays.asList(queries1);
        List<Integer> machedList = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        stringsList.stream().forEach(w -> {
                    if (map.containsKey(w)) {
                        map.put(w, map.get(w) + 1);
                    } else map.put(w, 1);
                }

        );
        queriesList.stream()
                .forEach(q -> {
                    if (map.containsKey(q)) {
                        machedList.add(map.get(q));
                    } else machedList.add(0);
                });


        return machedList.stream().mapToInt(i -> i).toArray();
    };


    public static int[] findMatched(String[] strings, String[] queries) {
/*

        List<String> stringsList = Arrays.asList(strings);
        List<String> queriesList = Arrays.asList(queries);
        List<Integer> machedList = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        stringsList.stream().forEach(w -> {
                    if (map.containsKey(w)) {
                        map.put(w, map.get(w) + 1);
                    } else map.put(w, 1);
                }

        );
        queriesList.stream()
                .forEach(q -> {
                    if (map.containsKey(q)) {
                        machedList.add(map.get(q));
                    } else machedList.add(0);
                });


        return machedList.stream().mapToInt(i->i).toArray();
    }


*/

        return null;

    }


}

@FunctionalInterface
interface SearchString {

    int[] result(String[] strings, String[] queries);
}