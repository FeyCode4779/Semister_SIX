package ASSEGMENTS.Assegment_ONE;
public class PartTime_Student extends Student {
    @Override
    public  void updateGradeMinus(int value) {
        int grade = 0;
        if (grade == -1) {
            throw new IllegalArgumentException("No grade has been inserted");
        }
        int updatedGrade = grade - value;
        if (updatedGrade < 0) {
            throw new IllegalArgumentException("Grade cannot be less than 0");
        }
        grade = updatedGrade;
    }

    @Override
    public  void updateGradePlus(int value) {
        int grade = 0;
        if (grade == -1) {
            throw new IllegalArgumentException("No grade has been inserted");
        }
        int updatedGrade = grade + value;
        if (updatedGrade > 100) {
            throw new IllegalArgumentException("Grade cannot be greater than 100");
        }
        grade = updatedGrade;
    }
}
