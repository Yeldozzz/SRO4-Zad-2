package school;

import java.util.Map;

public class GradeChecker {

    public static void findGrade(Map<String, Integer> grades, String student)
            throws StudentNotFoundException, LowGradeException {

        if (!grades.containsKey(student)) {
            throw new StudentNotFoundException("Студент " + student + " не найден в списке!");
        }

        int grade = grades.get(student);

        if (grade < 50) {
            throw new LowGradeException("У студента " + student + " низкая оценка: " + grade);
        }

        System.out.println("✅ " + student + " успешно сдал с оценкой " + grade);
    }
}
