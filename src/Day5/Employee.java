package Day5;


public class Employee {

    //Static fields
    private static int employeeCount = 0;
    private static int idCounter     = 0;

    //Private instance fields
    private final String employeeId;
    private String name;
    private String department;
    private double baseSalary;
    private int    experienceYears;

    //Constructor
    public Employee(String name, String department, double baseSalary, int experienceYears) {
        idCounter++;
        employeeCount++;
        this.employeeId = String.format("EMP%03d", idCounter);


        setName(name);
        setDepartment(department);
        setBaseSalary(baseSalary);
        setExperienceYears(experienceYears);
    }

    //Static method

    public static int getTotalEmployees() {
        return employeeCount;
    }

    //Getters

    public String getEmployeeId()    { return employeeId; }
    public String getName()          { return name; }
    public String getDepartment()    { return department; }
    public double getBaseSalary()    { return baseSalary; }
    public int    getExperienceYears() { return experienceYears; }

    //Setters with validation

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name.trim();
    }


    public void setDepartment(String department) {
        this.department = department;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 15_000) {
            throw new IllegalArgumentException(
                    "Base salary must be >= 15,000. Provided: " + baseSalary);
        }
        this.baseSalary = baseSalary;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 0) {
            throw new IllegalArgumentException(
                    "Experience years cannot be negative. Provided: " + experienceYears);
        }
        this.experienceYears = experienceYears;
    }

    //toString
    @Override
    public String toString() {
        return String.format(
                "Employee{id='%s', name='%s', dept='%s', salary=%.2f, exp=%d yrs}",
                employeeId, name, department, baseSalary, experienceYears);
    }

    // Overloaded calculateBonus()

    public double calculateBonus() {
        return baseSalary * 0.10;
    }


    public double calculateBonus(double percentage) {
        return baseSalary * (percentage / 100.0);
    }

    public double calculateBonus(double percentage, boolean includeExperienceBonus) {
        double bonus = calculateBonus(percentage);   // reuse variant 2
        if (includeExperienceBonus) {
            bonus += 1_000.0 * experienceYears;
        }
        return bonus;
    }
}
