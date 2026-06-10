package Day5;

public class Main {

    public static void main(String[] args) {

        System.out.println("=======================================================");
        System.out.println("       EMPLOYEE MANAGEMENT SYSTEM – TEST RUN           ");
        System.out.println("=======================================================\n");

        // ── 1. Create Employees ──────────────────────────────────────────────

        Employee emp1 = new Employee("Aarav Sharma",   "Engineering",  75_000, 5);
        Employee emp2 = new Employee("Priya Mehta",    "HR",           55_000, 3);
        Employee emp3 = new Employee("Rohan Verma",    "Marketing",    45_000, 8);
        Employee emp4 = new Employee("Sneha Kapoor",   "Finance",      90_000, 12);

        System.out.println("Employees Created");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);

        // ── 2. Static method: total count ───────────────────────────────────

        System.out.println("\n── Total Employees Created ─────────────────────────────");
        System.out.println("Employee.getTotalEmployees() → " + Employee.getTotalEmployees());

        // ── 3. Getters ───────────────────────────────────────────────────────

        System.out.println("\n── Getter Demonstration (emp1) ─────────────────────────");
        System.out.println("ID         : " + emp1.getEmployeeId());
        System.out.println("Name       : " + emp1.getName());
        System.out.println("Department : " + emp1.getDepartment());
        System.out.println("Base Salary: ₹" + emp1.getBaseSalary());
        System.out.println("Experience : " + emp1.getExperienceYears() + " years");

        // ── 4. Setters with valid updates ────────────────────────────────────

        System.out.println("\n── Setter: Valid Update (emp2) ─────────────────────────");
        emp2.setName("Priya Mehta-Joshi");
        emp2.setBaseSalary(60_000);
        emp2.setExperienceYears(4);
        System.out.println("Updated emp2 → " + emp2);

        // ── 5. Setter validation – catch IllegalArgumentExceptions ───────────

        System.out.println("\n── Setter Validation Tests ─────────────────────────────");

        // 5a. Invalid salary
        try {
            emp3.setBaseSalary(10_000);   // below 15,000 – should throw
        } catch (IllegalArgumentException e) {
            System.out.println("[OK] Salary validation: " + e.getMessage());
        }

        // 5b. Null / empty name
        try {
            emp3.setName("   ");          // blank – should throw
        } catch (IllegalArgumentException e) {
            System.out.println("[OK] Name validation  : " + e.getMessage());
        }

        // 5c. Negative experience
        try {
            emp3.setExperienceYears(-2);  // negative – should throw
        } catch (IllegalArgumentException e) {
            System.out.println("[OK] Exp validation   : " + e.getMessage());
        }

        // 5d. Null name
        try {
            emp4.setName(null);
        } catch (IllegalArgumentException e) {
            System.out.println("[OK] Null name check  : " + e.getMessage());
        }

        // ── 6. calculateBonus() overloads ────────────────────────────────────

        System.out.println("\n── calculateBonus() Overloads ──────────────────────────");

        // For emp4: baseSalary = 90,000 | experience = 12 yrs
        System.out.println("Testing on: " + emp4);

        // Variant 1 – no args → 10%
        double bonus1 = emp4.calculateBonus();
        System.out.printf("%n  Variant 1 (10%% of base)                  → ₹%.2f%n", bonus1);

        // Variant 2 – custom percentage
        double bonus2 = emp4.calculateBonus(15);
        System.out.printf("  Variant 2 (15%% of base)                  → ₹%.2f%n", bonus2);

        // Variant 3 – percentage + experience bonus (true)
        double bonus3 = emp4.calculateBonus(15, true);
        System.out.printf("  Variant 3 (15%% + ₹1000×12 yrs, exp=true)→ ₹%.2f%n", bonus3);

        // Variant 3 – percentage, experience bonus excluded (false)
        double bonus4 = emp4.calculateBonus(15, false);
        System.out.printf("  Variant 3 (15%% + exp=false)               → ₹%.2f%n", bonus4);

        // Bonus for all employees using default (10%) for a payroll summary
        System.out.println("\n── Default Bonus Summary (10%% for all) ────────────────");
        for (Employee e : new Employee[]{emp1, emp2, emp3, emp4}) {
            System.out.printf("  %-20s [%s] → Bonus: ₹%.2f%n",
                    e.getName(), e.getEmployeeId(), e.calculateBonus());
        }

        System.out.println("\n=======================================================");
        System.out.println("                    TEST COMPLETE                     ");
        System.out.println("=======================================================");
    }
}
