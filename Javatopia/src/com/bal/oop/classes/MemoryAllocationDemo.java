package com.bal.oop.classes;

public class MemoryAllocationDemo {
    public void demo() {
        /*
        Java manages two different areas of the memory:
        > HEAP
            > store objects
        > STACK
            > primitives and short-lived variables
         */

        //first it will evaluate what we have on the right side of the assignment operator
        /*
        > will create a new textbox object
        > store it on the HEAP.
        Let's say the address on the HEAP is 100. Then Java runtime is going to execute the other part of the code
        var textBox1.
        Here it will allocate some memory on the STACK and in this memory location, it will store the address of our
        textbox object on the HEAP.
        var textBox1 is referencing an object on the HEAP, that's why we refer to these variables as reference types,
        because  these variables don't store the actual values
        Primitive Types on the other hand are different. When we declare an integer, that integer is stored on the STACK
        and the value in that variable will be stored in that memory location.

         */

        /*
        in this example, both this variables are referencing the same TextBox objects on the HEAP. We don't have two
        different text box objects, there is only a signle TextBox object on the HEAP. We have 2 variables on the stack
        that are referencing this object.
         var textBox2 = textBox1; //the address location, for example 100
         with these piece of code, both these variables are referencing the same object and that means, if we modify
         that object through one of these references or one of this variables, the changes would be visible through the
         other variable.
         */

        /*
        Memory deallocation
        In Java, unlike C++, we don't have to worry about deallocating memory. Java will automatically take care of that.
        How it works in stack:
        > when we exist a method, java runtime will immediately remove all the variables  that are stored in the stack.
        in this examples textBox1 and textBox2 are stored in the Stack, and they will be immediately removed after we
        finish executing the show() method.

        How it works in Heap:
        Now we end up with an object that is on the HEAP, and there are no references to this object, so if there is
        another process in the background. it is watching these objects on the heap. If an object becomes unused for
        a certain period of time, that process is going to automatically remove that object on the heap.
        This is called GARBAGE COLLECTION.
        Java Runtime has this component called GARBAGE COLLECTOR which will automatically remove unused objects on the
        Heap.
         */
        var textBox1 = new TextBox();
        var textBox2 = textBox1;
        textBox2.setText("Hello World");
        System.out.println(textBox1.text);
    }
}
