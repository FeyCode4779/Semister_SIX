package ASSEGMENTS.Assegment_ONE;

public class main {
    public static void main(String[] args) {
        Student student = new Student();
        student.insertGrade(80);
        System.out.println(student.getGrade());  // Output: 80

        student.updateGradeMinus(10);
        System.out.println(student.getGrade());  // Output: 70

        student.updateGradePlus(20);
        System.out.println(student.getGrade());  // Output: 90

        PartTime_Student partTimeStudent = new PartTime_Student();
        partTimeStudent.insertGrade(95);
        System.out.println(partTimeStudent.getGrade());  // Output: 95

        PartTime_Student.updateGradeMinus(10);
        System.out.println(partTimeStudent.getGrade());  // Output: 85

        PartTime_Student.updateGradePlus(20);
        System.out.println(partTimeStudent.getGrade());  // Output: 105 (throws IllegalArgumentException)
    }
}