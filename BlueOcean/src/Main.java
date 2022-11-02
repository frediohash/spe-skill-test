import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Employee> list1 = new ArrayList<>();
        list1.add(new Employee(1, "a"));
        list1.add(new Employee(2, "b"));
        list1.add(new Employee(3, "c"));
        List<Employee> list2 = new ArrayList<>();
        list2.add(new Employee(1, "a"));
        list2.add(new Employee(4, "d"));
        list2.add(new Employee(5, "e"));
        list2.removeAll(list1);
        System.out.println(list2);
    }

    public static class Employee {
        private long employeeId;
        private String name;
        // whatever more variables

        public Employee(long employeeId, String name) {
            this.employeeId = employeeId;
            this.name = name;
        }

        public String toString() {
            return String.format("Employee[employeeId=%s, name=%s]", employeeId, name);
        }

        @Override
        public boolean equals(Object o) {
            if (o instanceof Employee) {
                return this.employeeId == ((Employee) o).employeeId;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return new Long(employeeId).hashCode();
        }
    }
}

