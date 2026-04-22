import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        // add 10 students
        students.clear();

        students.add(new Student(10, "Zack", "AZ"));
        students.add(new Student(9, "Yara", "TX"));
        students.add(new Student(8, "Xander", "CA"));
        students.add(new Student(7, "Will", "NV"));
        students.add(new Student(6, "Victor", "FL"));
        students.add(new Student(5, "Umar", "WA"));
        students.add(new Student(4, "Tom", "NY"));
        students.add(new Student(3, "Sam", "CO"));
        students.add(new Student(2, "Rick", "UT"));
        students.add(new Student(1, "Quinn", "OR"));

        // BEFORE SORT
        System.out.println("Original List:");
        for (Student s : students) {
            System.out.println(s);
        }

        // SORT BY NAME
        SelectionSort.sort(students, new NameComparator());

        System.out.println("\nSorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }

        // SORT BY ROLL NUMBER
        SelectionSort.sort(students, new RollnoComparator());

        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
