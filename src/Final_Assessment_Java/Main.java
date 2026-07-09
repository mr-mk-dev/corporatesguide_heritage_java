package Final_Assessment_Java;

import java.util.*;

class Employee {
    int id;
    String name;
    int score;

    Employee(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        ArrayList<Employee> list = new ArrayList<>();

        double sum = 0;

        Employee highest = null;
        Employee lowest = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter id : ");
            int id = sc.nextInt();
            System.out.print("Enter name : ");
            String name = sc.next();
            System.out.print("Enter score : ");
            int score = sc.nextInt();

            Employee emp = new Employee(id, name, score);
            list.add(emp);

            sum += score;

            if (highest == null || score > highest.score) {
                highest = emp;
            }

            if (lowest == null || score < lowest.score) {
                lowest = emp;
            }
        }

        double avg = sum / n;

        System.out.println("Average Score : "  + avg);

        System.out.println("Highest Scorer: " + highest.name + " " + highest.score);
        System.out.println("Lowest Scorer: " + lowest.name + " " + lowest.score);

        ArrayList<Employee> qualified = new ArrayList<>();

        for (Employee e : list) {
            if (e.score >= avg) {
                qualified.add(e);
            }
        }

        Collections.sort(qualified, (a, b) -> {
            if (b.score != a.score) {
                return b.score - a.score;
            }
            return a.name.compareTo(b.name);
        });

        System.out.println("\nQualified Employees:");
        for (Employee e : qualified) {
            System.out.println(e.name + " " + e.score);
        }

        sc.close();
    }
}