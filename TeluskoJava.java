import javax.swing.border.StrokeBorder;

public class TeluskoJava {
    public static void main(String[] args) {
        int num1 = 10; // int-type, num1-variable, 10-literals
        int num2 = 20;

        String emp1_Name = "jay";
        String emp2_Name = "Kumar";

        boolean compair = num1 == num2; // compair both are exactly same or not
        boolean notCompair = num1 != num2; // not operator
        boolean nameCompair = emp1_Name != emp2_Name;

        boolean andOperator = num1 < num2 && emp1_Name != emp2_Name; // both need to true to aned - true
        boolean notOperator = num1 < num2 || emp1_Name == emp2_Name; // anyone need to be true to and - true
        // System.out.println(num1 + num2);
        System.out.println(compair);
        System.out.println(notCompair);
        System.out.println(nameCompair);
        System.out.println(andOperator + " -" + "and operator");
        System.out.println(notOperator + " - " + "not operator");
    }
}
