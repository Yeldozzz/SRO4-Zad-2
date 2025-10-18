import school.GradeChecker;
import school.StudentNotFoundException;
import school.LowGradeException;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Айткалиев Елдос", 85);
        grades.put("Алия", 45);
        grades.put("Данияр", 70);

        try {
            GradeChecker.findGrade(grades, "Айткалиев Елдос");  
            GradeChecker.findGrade(grades, "Алия");             
            GradeChecker.findGrade(grades, "Марат");           
        } 
        catch (StudentNotFoundException e) {
            System.out.println("⚠️ Ошибка: " + e.getMessage());
        } 
        catch (LowGradeException e) {
            System.out.println("❌ Предупреждение: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
}
