package com.capg.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Employee e;
        SBU sbu;
        ApplicationContext c=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
        sbu=(SBU)c.getBean("sbu");
        e=(Employee)c.getBean("employee");
        System.out.println("Employee Details:");
        System.out.println("---------------------------------------------");
        System.out.println("Employee ID: "+e.employeeId);
        System.out.println("Employee Name: "+e.employeeName);
        System.out.println("Employee Salary: "+e.salary);
        System.out.println("Employee BU: "+e.getSbuDetails());
        System.out.println("Employee Age: "+e.age);
        System.out.println(e);
        System.out.println("SBU Details:");
        System.out.println("---------------------------------------------");
        System.out.println(sbu);
        
        
    }
}
