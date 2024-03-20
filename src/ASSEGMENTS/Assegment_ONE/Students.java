//package ASSEGMENTS.Assegment_ONE;
//
//public class Student {
//    private int grade;
//
//    public Student() {
//        this.grade = -1;
//    }
//
//    public void insertGrade(int grade) {
//        if (grade < 0) {
//            throw new IllegalArgumentException("Grade cannot be less than 0");
//        }
//        this.grade = grade;
//    }
//
//    public void updateGradeMinus(int value) {
//        if (grade == -1) {
//            throw new IllegalArgumentException("No grade has been inserted");
//        }
//        int updatedGrade = grade - value;
//        if (updatedGrade < 0) {
//            throw new IllegalArgumentException("Grade cannot be less than 0");
//        }
//        grade = updatedGrade;
//    }
//
//    public void updateGradePlus(int value) {
//        if (grade == -1) {
//            throw new IllegalArgumentException("No grade has been inserted");
//        }
//        int updatedGrade = grade + value;
//        if (updatedGrade > 100) {
//            throw new IllegalArgumentException("Grade cannot be greater than 100");
//        }
//        grade = updatedGrade;
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
////public class Students {
////    private int grade;
////
////    Students(){
////        grade = 80;
////    }
////    int inserGrade(int ){
////        return grade;
////    }
////
////    int updateGradeMinus(int grade){
////        Students.inserGrade()-=grade;
////        return min;
////    }
////
////    int updateGradePlus(int grade){
////        int min = grade + 1;
////        return min;
////    }
////
////    public static void main(String[] args) {
////        Students hh = new Students();
////        int result = hh.inserGrade(30);
////        System.out.println(result);
////
////        int result2 = hh.updateGradeMinus(1);
////        System.out.println(result2);
////    }
////
////
////}
