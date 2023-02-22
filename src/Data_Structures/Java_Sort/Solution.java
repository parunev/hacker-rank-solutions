package Data_Structures.Java_Sort;

import java.util.*;

class Student {
    private final int id;
    private final String firstName;
    private final double cgpa;
    public Student(int id, String firstName, double cgpa) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases-- > 0) {
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();
            Student st = new Student(id, fname, cgpa);
            studentList.add(st);
        }

        studentList.sort(new StudentComparator());
        for (Student st: studentList) {
            System.out.println(st.getFirstName());
        }
    }
}

class StudentComparator implements Comparator<Student> {
    double epsilon = 0.001;

    @Override
    public int compare(Student s1, Student s2) {
        if (Math.abs(s1.getCgpa() - s2.getCgpa()) > epsilon) {
            return s1.getCgpa() < s2.getCgpa() ? 1 : -1;
        } else if (!s1.getFirstName().equals(s2.getFirstName())) {
            return s1.getFirstName().compareTo(s2.getFirstName());
        } else {
            return s1.getId() - s2.getId();
        }
    }
}
