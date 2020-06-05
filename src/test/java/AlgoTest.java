
import excersize.Person;
import org.junit.Test;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class AlgoTest {

    @Test
    public void testBubbleSort() {

        int[] a = {1, 4, 3, 5, 2, 8, 3, 4, 3};

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {

                    int temp = a[i];

                    a[i] = a[j];

                    a[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));

    }


    @Test
    public void firstRecurringCaharacter() {

        String s = "DBCABA";


        char[] chars = s.toCharArray();

        HashSet<Character> charSet = new HashSet<>();


        for (char c : chars) {

            if (charSet.contains(c)) {
                System.out.println(c);
                break;
            } else
                charSet.add(c);
        }
    }

    @Test
    public void findTwoIntegerMultiplyBy20() {

        int[] a = {2, 4, 1, 6, 5, 40, -1};

        int result = 0;

        for (int k = 0; k < a.length; k++) {

            result = 10 * result + a[k];
        }

        System.out.println(result);

        List<Integer> list = Arrays.stream(a)
                .boxed()
                .collect(Collectors.toList());
    }

    @Test
    public void findUnionOfUnsortedArray() {

        int a[] = {7, 1, 5, 2, 3, 6};

        int b[] = {3, 8, 6, 20, 7};

        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < a.length; i++) {

            set.add(a[i]);
        }

        for (int j = 0; j < b.length; j++) {

            set.add(b[j]);
        }

        System.out.println(set.toString());

    }

    @Test
    public void givenOptional_whenGetsValue_thenCorrect() {

        Person person = new Person("The first name", "The last name", 34);
        Person person1 = new Person("The first name", "The last name", 35);
        Person person2 = new Person("The first name", "The last name", 35);

        assertEquals(-1, calCulatePersonAge(null));
    }


    public int calCulatePersonAge(Person person) {

        return Optional.ofNullable(person)
                .map(Person::getAge)
                .filter(p -> p > 33)
                .filter(p -> p < 35)
                .orElse(-1);

    }


    @Test
    public void arrayCopyExample() {

        int[] parent = {1, 2, 3, 4, 2, 3, 4, 6, 1, 10, 45, 2};

        mergeSort(parent, parent.length);

    }


    public void mergeSort(int[] ar, int n) {

        if (n < 2) {
            return;
        }

        int mid = ar.length / 2;

        int[] a = new int[mid];
        int[] b = new int[ar.length - mid];

        for (int i = 0; i < mid; i++) {

            a[i] = ar[i];
        }

        for (int j = mid; j < ar.length; j++) {

            b[j - mid] = ar[j];

        }

        mergeSort(a, mid);
        mergeSort(b, n - mid);

    }


    public void merge(int[] ar, int[] l, int[] r) {

    }

    @Test
    public void findMedin() {

        int[] a = {1, 3, 4, 5, 6, 7, 8};

        double median = 0;

        if (a.length % 2 == 0) {

            int mid = a.length / 2;
            median = (a[mid] + a[mid - 1]) / 2.0;

        } else {

            median = a[a.length / 2];
        }
        System.out.println(median);
    }

    @Test
    public void findDigitFromString() {


        String input = "a,1,b,2,c,3,d,4";

        String s = "";


        char[] chars = input.toCharArray();

        for (char c : chars) {

            if (Character.isDigit(c)) {
                s = s + c;
            }
        }

        System.out.println();

    }

    @Test
    public void stripNonDigits() {

        String ss = "hello is there any way to communicate with 100 people at a time or 300 may be better";

        TreeMap<Character, Integer> treemap = new TreeMap<>();

        for (int i = 0; i < ss.length(); i++) {
            final char c = ss.charAt(i);
            if (c > 47 && c < 58) {
                if (Character.isDigit(c)) {
                    treemap.put(c, treemap.getOrDefault(c, 0) + 1);
                }

                // System.out.println(Character.isDigit(c));
            }
        }


        int[] arr = treemap.values().stream().mapToInt(i -> i).toArray();

        //System.out.println(Arrays.toString(b));

        // System.out.println(list.toString());

    }


    @Test
    public void testMerge() {

        int[] la = {1, 5, 6, 7};
        int[] ra = {8, 9, 10};
        int[] temp = new int[la.length + ra.length];
        merge(temp, la, 4, ra, 3);

        System.out.println(Arrays.toString(temp));

    }

    public  void mergesort(int [] ar, int n){

        if(n < 2){
            return ;
        }
        // craete two arrays
        int middle = n/2;
        int [] l = new int [middle];
        int [] r = new int [n - middle];

        // copy element from the left side of the array
        for(int i = 0; i< middle; i ++){
            l[i] = ar[i];
        }

        // copy element from the  right side of the array
        for(int j = middle; j<n; j++ ){
            r[j-middle] = ar[j];
        }

        mergesort(l,middle);
        mergesort(r, n-middle);
        merge(ar,l,middle, r,n - middle);

    }


    public void merge(int[] temp, int[] la, int l, int[] ra, int r) {

        int i = 0, j = 0, k = 0;

        while (i < l && j < r) {

            if (la[i] < ra[j]) {
                temp[k++] = la[i++];
            } else temp[k++] = ra[j++];

        }

        while (i < l) {

            temp[k++] = la[i++];
        }

        while (j < r) {

            temp[k++] = ra[j++];
        }

    }



    @Test
    public void balnacedBracket(){

        String bracket = "{([])}";

        Stack<Character> characters = new Stack();
    }


    @Test
    public void shouldConvertDateToLocalDate() throws Exception {

        Date dateIn = new Date();

        LocalDate date = dateIn.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        assertEquals(dateIn,date);


    }
}
