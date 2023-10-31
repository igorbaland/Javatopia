package com.bal.oop.thesecondprinipal.coupling;

public class EmployeeMain {
    public void demo() {
        /*
        The EmployeeMain is dependent on the main class
        the first coupling point, where we create a new instance of an employee class. Currently, we are not passing
        any values or arguments here, but if in the future we change the employee class such that we have to pass the
        name of the employee at the time of creation, then we have to come back to the main class, and pass the name
        here. So we have to modify the main class. And the ode in this class has to be recompiled.

        Here is another coupling point, where we are calling the setters and calculateWage method. In this example we
        have 4 coupling points to the employee class. Now this is not necessarily a bad thing, you really need these
        coupling points here. let us take a look at the members of the employees class.
         */
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        /*
        let us take a look at the members of the employees class. Here we have a couple of methods that we have not used
        in this class > getters. Let us say there is really no requirement to these methods. If you don't have
        requirement to use these methods, it's better to hide or delete them.

        Because the more methods a class provides, the more other classes are going to get coupled to it. Just like the
        phone and the apps you have installed on it. If your phone has only 5 apps, you have 5 coupling points to your
        phone. We hide (make it private) in employee class getter methods.
         */
        //employee.getBaseSalary();

        /*
        Now we only have three methods to use. So the interface of this class is
        > simpler
        > easier to use
        > less coupling in the future

        Metaphor
        Remote Control have so many buttons, and they are really hard to use. In contrast, we have remote controls like
        this  that are super easy to use. These buttons on this remote control are like the methods in our classes. We
        want to reduce the number of these methods exposed outside the class.

         */
    }
}
