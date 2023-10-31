package com.bal.oop.classes;

public class ProceduralProgrammingDemo {
    public void demo() {
        /*
        what is wrong with these code?
        Technically there is nothing wrong here, because this is a very simple program, our demo method has only 5
        lines of code and we have calculateWage method there is only 1 line long.
        If we extend this program, if we add more features to it, with this set of programming, we will end up with
        a very fat demo() method. Our demo() method is going to get bloated (aufgeblaeht) with so many lines of code
        Yes we can definitely extract some of these methods, and put them in other methods, like our calculateWage
        method. But again our main class, will end up getting so bloated... That is what we call PROCEDURAL PROGRAMMING.
        We don't really have classes and objects, we have a bunch of variables and a bunch of functions also called
        PROCEDURES.

        A lot of java developers who write code like this and they assume they are doing object oriented programming
        because java is an object oriented programming language. So just because they use the main class, or declare
        a few other classes, they assume their doing object oriented programming, but that's not true.
        Just because you're using classes and objects in your programs, doesn't mean you are doing object oriented
        programming.

        Object oriented programming is way more then using classes and objects. It has a lot of techniques

        Problems with procedural code
        Code like this , we will end up with really fat methods or fat classes
            > programming written this way are very HARD TO MAINTAIN. If something goes wrong, you have to go all over
            the place, look at so much code, and figure out what you need to change. And as soon as you change
            something, so many things can break, you will create other bugs in your programs.

            > lack of reusability, so you will enf up with so many functions or methods all over the place, and if you
            want to reuse them in other programs you have to copy some code from here, some code from there, and then
            you cannot put them together because their parameters or arguments are different, it's jus so messy.
            This ist what we call SPAGHETTI CODE. Code that looks like spaghetti, everything is interconnected with
            each other. It's really hard to change programs like this.

         */
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public int calculateWage(
                    int baseSalary,
                    int extraHours,
                    int hourlyRate
                ) {
        /*
        here is one of the symptoms of code written in procedural style, you will end up with methods that have so
        many parameters. In this case the method is not too bad, here you only have three parameters, but there are
        developers who have functions with 5 or even 10 parameters. Sometimes even more. If you have methods like that,
        that's a definite symptom that you are not doing object oriented programming. So if you are constantly calling
        and passing so many arguments, that means you are doing procedural programming.
         */
        return baseSalary + (extraHours * hourlyRate);
    }
}
