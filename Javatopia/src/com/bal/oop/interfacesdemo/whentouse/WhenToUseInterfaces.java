package com.bal.oop.interfacesdemo.whentouse;

public interface WhenToUseInterfaces {
    /*
    In my courses, I always  emphasize (betone) the importance of problem solving. You shouldn't write code simply for
    the sake (Wille) of writing it. Every bit of code you write, you need to understand what are you trying to write and
    what you are trying to solve. I have seen a lot of people abstract an interface from every class in the project and
    call it the best practice because they are using interfaces. As I have mentioned throughout the section, you should
    use interfaces in situations:
    > where you want to decouple a class from it is dependencies, and it gives you a number of benefits:
        1) you can easily solve one implementation with another (SWAP IMPLEMENTATIONS/CONCRETE CLASSES) dor example,
        if you want an algorithm  for encoding videos, do you want to replace that algorithm with the faster algorithm
        in the future? That's a good case for decoupling these classes. So you can supply a new classes in the future
        with minimal or null impact on your application.
                        VideoProcessor ---> Interface <--- VideoEncoder
        In other cases, when when are you using third party services, let's say you are using one service for sending
        emails, tomorrow you may want to switch to a different provider.
                        VideoProcessor ---> Interface <--- EmailService
        Mortgage calculator project
        In our project we are using this calculator class. It is very unlikely we are going to replace this with another
        calculator , because the calculation and mortgage payment schedule is straight forward and doesn't change, you
        are not going to have a different algorithm that is faster or more accurate, so there is really no need to
        extract an interface from mortgage and inject it into report class. Unless you want to do it for unit testing.
        We will talk about this later.
    > another benefit of using interfaces is you can easily EXTEND YOUR APPLICATION with minimal impact. This is
    particularly useful if you are designing a framework for others to use. For example, let's say you are building a
    framework for building web applications. Your framework should have an template engine. You should be able to parse
    html templates, put some data in there, and return the response to the client. Now, you may supply a default
    template and engine in your framework. but perhaps you want to allow other people to build their own template
    engines. That's another case for using interfaces. So instead of programming against a concrete implementation like
    a concrete template engine, you program against interfaces. Other people can create new template engines that
    implement your interfaces
                        HttpResponse ---> Interface <--- TemplateEngine
    By using interfaces you add extensibility points to your framework.
    > Finally the last benefit of using interfaces is that you TEST your classes in isolation. If a class uses an email
    Service or a storage engine, you can decouple it from these dependencies and test this class in isolation. This what
    we call unit tesing (That's a topic for an entirely different course).
          without EmailService > [VideoProcessor] ---> Interface <--- EmailService


    Once again, don't just blindly write code and follow these so called best practices, because someone told you to do
    so. For every piece of code you write, you need to understand the problem you are trying to solve. If you are not
    solving any problems, you are just wasting your times, you are not adding any values. In fact your increasing the
    costs, because the more code you write - the more bugs you are going to create and the maintenance of your
    applications is going to be some costly.
     */
}
