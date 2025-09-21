package Student_Management;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private double grade;
    private int studentId;

    public Student(String name, double grade, int studentId) {
        this.name = name;
        this.grade = grade;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Grade: " + grade + " ID: " + studentId;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç öğrenci eklemek istiyorsunuz?");
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ayse", 90.5, 1));
        students.add(new Student("Ali", 85.0, 2));
        students.add(new Student("Veli", 78.0, 3));

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            System.out.println("Enter student grade:");
            double grade = scanner.nextDouble();
            System.out.println("Enter student id:");
            int studentId = scanner.nextInt();
            scanner.nextLine();

            try {
                for (Student student : students) {
                    if (student.getStudentId() == studentId) {
                        throw new IllegalArgumentException(
                                "Bu ID zaten mevcut. " + student.getName());
                    }
                }

                if (grade < 50) {
                    throw new IllegalArgumentException("Not 50'den küçük olamaz.");
                }

                students.add(new Student(name, grade, studentId));

            } catch (IllegalArgumentException e) {
                System.out.println("Hata: " + e.getMessage());
                i--;
            } finally {
                System.out.println("Tamamlandı.");
            }

        }
        for (Student student : students) {
            System.out.println(student);
        }
        scanner.close();
    }
}