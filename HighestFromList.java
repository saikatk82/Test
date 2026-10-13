import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestFromList {

    public static void main(String[] args){
        List<Emp> employees = Arrays.asList(
                new Emp("John", 65, "New York"),
                new Emp("Sam", 55, "Chicago"),
                new Emp("David", 70, "New York"),
                new Emp("Mike", 62, "Chicago"),
                new Emp("Sara", 45, "Boston")
        );

       // Sort the list by age first
       // one way
        employees.sort((e1, e2) -> Integer.compare(e2.getAge(), e1.getAge()));
       //second way
        employees.sort(Comparator.comparing(Emp::getAge));


        // Find the employee with the highest age
        employees.stream()
                .max(Comparator.comparing(Emp::getAge))
                .ifPresent(highestAgeEmp -> System.out.println("Employee with highest Age: "
                        + highestAgeEmp.getName() + " - " + highestAgeEmp.getAge()));

        Map<String, List<Emp>> result = employees.stream()
                        .filter(e -> e.getAge() > 60)
                        .collect(Collectors.groupingBy(Emp::getCity));

        result.forEach((city, empList) -> System.out.println(city + " -> " + empList.stream().map(Emp::getName).toList()));

    }
}
