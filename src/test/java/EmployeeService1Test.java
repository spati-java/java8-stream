import model.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.EmployeeService1;


import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class EmployeeService1Test {

    EmployeeService1 employeeService1;

    @Before
    public void setUp() throws Exception {

        employeeService1 = new EmployeeService1();
    }

    @Test
    public void findAllFirstNameByLastName() throws Exception {

        String[] actualArrayOfFirstName = employeeService1.findArrayOfFirstNameByLastNameFromEmployeeList("Travolta");
        String[] expectedArrayOfLastName = {"John", "John", "Sean"};
        System.out.println(Arrays.toString(actualArrayOfFirstName));
        assertArrayEquals(actualArrayOfFirstName, expectedArrayOfLastName);
    }

    @Test
    public void findAllEmployeesByLastName() throws Exception {

        List<Employee> employees = employeeService1.findAllEmployeesByLastName("Travolta");
        assertEquals(employees.size(), 3);
    }

    @Test
    public void findEmployeeListSortedBySalaryAsce() throws Exception {

        List<Employee> sortedEmployeeList = employeeService1.fndAllEmployeesSortedBySalary();
        sortedEmployeeList.forEach(System.out::println);
    }

    @Test
    public void isPangram() {

        int[] a = {1, 4, 3, 4, 5};
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(6);

        list.stream().sorted().collect(Collectors.toList());

        System.out.println(Arrays.toString(a));

        int d = 4;

        for (int i = 0; i < d; i++) {

            int k;

            int temp = a[0];

            for (k = 0; k < a.length - 1; k++) {
                a[k] = a[k + 1];
            }

            a[k] = temp;

        }

        System.out.println(Arrays.toString(a));


    }

    @Test
    public void isValid() {

        String isValid = "NO";
        int count = 0;
        String s = "aabbcd";
        char[] c = s.toCharArray();
        int[] values = new int[c.length];

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < c.length; i++) {

            if (map.containsKey(c[i])) {

                map.put(c[i], map.get(c[i]) + 1);


            } else {
                map.put(c[i], 1);

            }
        }

        values = map
                .values()
                .stream()
                .mapToInt(i -> i)
                .toArray();

        for (int j = 0; j < values.length - 1; j++) {

            if (values[j] != values[j + 1]) {
                count++;
            }
        }
        System.out.println(Arrays.toString(values));
        if (count <= 1) {
            isValid = "YES";
        }
        System.out.println(count);

        Assert.assertEquals("NO", isValid);

    }

    @Test
    public void testArrayElement() {

        int[] A = {1, 2, 3, 9, 10, 12};

        int k = 7;

        Arrays.sort(A);

        int numberOfOperations = 0;

        List<Integer> list = Arrays.stream(A)
                .boxed()
                .collect(Collectors.toList());

        if (k < list.get(0)) {

            System.out.println(numberOfOperations);
        }

        for (int i = 0; i < list.size() - 1; i++) {

            int j = (1 * list.get(0)) + (2 * list.get(1));

            if (k > list.get(0)) {

                numberOfOperations++;

                list.remove(list.get(0));
                list.remove(list.get(0));
                list.add(j);

                list = list.stream()
                        .sorted()
                        .collect(Collectors.toList());

            }

        }


    }

    @Test
    public void testStack(){

        StackXX stackXX = new StackXX(5);

        stackXX.push(4);
        stackXX.push(3);

        Assert.assertEquals(stackXX.pop() , 3);
        Assert.assertEquals(stackXX.size,1);

    }

    @Test
    public void miniMaxSum() {

        int[] arr = {1, 2, 3, 4, 5};

        List<Integer> list = new ArrayList<>();

       Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < arr.length ; i++){
            stack.add(arr[i]);
        }


      while( !stack.isEmpty()){
          list.add(stack.pop());
      }

        System.out.println(list.toString());


    }



}

class StackXX {

    int index = -1;
    int capacity = 0;
    int size = 0;

    int [] arr;


    public StackXX(int capacity ){

        this.capacity = capacity;
        this.arr = new int[capacity];

    }


    public void push(int item){

        arr[++index] = item;
        size++;
    }

    public int pop(){

        size--;
        return  arr[index--];
    }

    public int peek(){

        if(isEmpty() ) {return -1;}

        return arr[index];
    }

    public boolean isEmpty(){

        return index == -1 ;
    }


}