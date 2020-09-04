/* Create array of employee instance and intialize the array by instance of Employee, each instance will have different
state, kindly take user input for initializing each instance of Employee.
 After initialization of array arrange the array in order employee salary. Then repeat to arrange the array in order of
 experience.(Descending Order)
 */


package main;

import datapack.Employee;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];
        System.out.println(Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Employee employee = new Employee();
            System.out.println("Enter firstName");
            employee.setFirstName(sc.nextLine());
            System.out.println("Enter lastName");
            employee.setLastName(sc.nextLine());
            System.out.println("Enter salary");
            employee.setSalary(sc.nextDouble());
            System.out.println("Enter emp Id");
            employee.setEmpId(sc.nextInt());
            System.out.println("Enter experience");
            employee.setExperience(sc.nextDouble());
            System.out.println("Enter mobile number");
            employee.setMobile(sc.nextLong());
            System.out.println("Enter email");
            sc.nextLine();
            employee.setEmail(sc.nextLine());
            arr[i] = employee;


        }
        System.out.println(Arrays.toString(arr));

        Employee[] sorted = sortSalaryOrder(arr);
        System.out.println("Sorted Salary");
        System.out.println(Arrays.toString(sorted));
        Employee[] sortedexp = sortExperienceOrderOrder(arr);
        System.out.println("Sorted array by experience");
        System.out.println(Arrays.toString(sortedexp));


    }

    public static Employee[] sortSalaryOrder(Employee[] arr) {
        Employee[] respond = arr.clone();
        for (int i = 0; i < respond.length; i++) {
            for (int j = 0; j < respond.length - 1; j++) {
                if (respond[j].getSalary() < respond[j + 1].getSalary()) {
                    Employee temp = respond[j];
                    respond[j] = respond[j + 1];
                    respond[j + 1] = temp;


                }
            }

        }
        return respond;
    }

    public static Employee[] sortExperienceOrderOrder(Employee[] arr) {
        Employee[] respond = arr.clone();
        for (int i = 0; i < respond.length; i++) {
            for (int j = 0; j < respond.length - 1; j++) {
                if (respond[j].getExperience() < respond[j + 1].getExperience()) {
                    Employee temp = respond[j];
                    respond[j] = respond[j + 1];
                    respond[j + 1] = temp;

                }
            }

        }
        return respond;
    }
}