package Array;

import lombok.AllArgsConstructor ;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Employee implements Comparable<Employee>
{
    String Name;
    int age;
    int salary;


    @Override
    public int compareTo(Employee employee) {

         if(age==employee.age)
         {
             return salary-employee.salary;
         }
         return age-employee.age;
    }
}
