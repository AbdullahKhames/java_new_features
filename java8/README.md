``#java 8 was a game changer in java world
most important features that we will discuss
    
    1- Default method in interface
    2- static method in interface
    3- foreach loop
    4- functional interface
    5- lambda expression
    6- predicate
    7- method reference
    8- streams


-----------------------------------------------------
    1- functional interface
        it is an interface with only one abstract method
        (that is a method without body)
        
        we can add an anotation to mark an interface to be a functional interface
        called @FunctionalInterface
        it is not mandatory
        but used to check weither an interface is a functional or not
        if it is put on an interface that is not functional it will give compilation error

        before java8 funcional interface were called SAM(Single Abstract Method)

        what is the use of functional interfaces?
            it is used in functional programing using lambda expression
        it needs to have only one abstract method
        but can have more than one static and default methods and also methods from
        java.lang.object
        because it has a default implmentation in Object class which all classes extends from either directly or indirectly.

-----------------------------------------------------


    2- lambda is an anonymous function which means a function without name
        syntax:
        on the left side
        input parameters are in parnathesis before the arrow (input parameter1, input parameter2)
        if no input paramas it is sent as empty paranthesis () -> logic;
        then the arrow -> operator (lambda symbol)
        then the logic on the right hand side
        
        to convert a regular function to lambda function:
        a- remove the name
        b- remove the data types from the function parameters
        c-  remove the return datatype
        d- remove the access specifier
        e- add the symbol ->
        f- if single line remove the curly braces
        g- if single line no need to put return keuword
        

        lambda Expression rules
        1- curly braces are optional if function is of single line
        2- curly braces are mandatory for multi line lambda
        3- curly braces are mandatory for lambda expression with return keyword
        4- semicloln is mandatory for all lambda expressions.
        5- only used with functional interfaces

        before java8 if you wanted to implement the interface you had to create an extra class to implement the interface
        but now you can provide the implementation as lambda expression.
-----------------------------------------------------
    3- method reference refering to a method done with ::
        Method reference is used to refer method of functional interface

        1- if the method is statice we can refer to it by the class name directly
            ContainingClass::staticMethodName

        2-  if the method is instance method refer to it by an instance
            containingObject::instanceMethodName  

        3- if you want to refer to the constructor refer to it by the keyword new
            ContainingClass::new

        rules for method reference
            1- method names can be different
            2- parameters should be same in both methods
            3- used with functional interfaces only
            4- we can have different return types of both methods
-----------------------------------------------------
    4- for each method
        it is used to iterate over collections
    
-----------------------------------------------------
    5- default methods in interface
        it is a method defined in an interface with the keyword default
        it is used to provide common functionality that can be used with all implementing classes
        default method should have a body and can be empty
        it is not compulsatory to implement a default method
        we can have any number of default methods in an interface
        
        if you want to add a method to an interace that is already implmented by multiple classes
        it will cause compilation error if you didn't implement the new method in all these classes
        
-----------------------------------------------------
    6- static method in interface
        used to provide utility method in an interface
        used to provide common functionality to be used with all implementing classes
        must have a body and cannot be empty
        we can have any number of static methods in an interface
        cannot be overridden so provides security by not allowing inheritors from overridding it
        only used with the interfacename 
-----------------------------------------------------
        
    7- some of java 8 predefined functional interfaces
        1- Function
            it is a predefined functional interface by java
            it takes a single input and returns a single output
            if you had the same requirement to takes a single input and returns a single output
            rather than creating your own method instead of creating the method just use the predefined functional interface
            an provide implmentation using lambda expression.
            
            it has the (apply) method that Applies this function to the given argument.
            also it has the (andThen) method :
                this take the return of the first function and then applies the new logic on the returned
                after.apply(apply(t));
            also it has the (compose) method:
                the opposite of andThen
                this returns a composed function that first applies the before function to its input
                and then applies this function to the result.
                apply(before.apply(v))

        2- Predicate
            it is a predefined functional interface by java
            it takes an oobject as input and returns either true or false based on the condition
            method test that checks wither an object should pass the predicate or not.

        3- supplier
            it is a predefined functional interface by java
            it takes no input and returns an output
            method called get that returns the Object.

        4- consumer
            it is a predefined functional interface by java
            it takes single input and returns nothing(void)
            method called accept that takes the object and does some operations and returns nothing

----------------------------------------

    8- streams
        it is a sequence of elements supporting sequential and parallel aggregate operations
        used to process objects from collections.
        intermediate operations always returns streams
        terminal operations returns a collection.

        only one source and only one terminal operation
        however we can have any number of intermeidate operations.
        source converting a collection to a stream
        intermeidate operations : returns a stream
            filter
            limit
            sorted
            map
                converts each object in a collection to an object
                done to achieve one to one mapping
            flatMap
                returns multiple objects of single element
                done to achieve one to many mapping

            peek
        terminal operations: it collects data
            collect
            count
            foreach
            reduce
            min
            max

        parralel streams are faster than normal streams they depend on the number of threads available at the machine where the code is running
----------------------------------------------------------------------------------------------


#joda Time (java.time package)
it provides quality replacement for the java date and time classes

problems of java Date & Time java.util.Date
    1- no consistency
        month starts with 1
        day starts with 0
    2- Date class represents both date and time
    3- it is not thread safe
    


    1- LocalDate class
        create object:
        1- LocalDate.now();
        2- LocalDate.of(int year,Month(this is an enum) month,int day);
        3- LocalDate.of(int year,int month,int day);

            you can get:
            1-  localDate.getYear()
            2-  localDate.getMonth()
            3-  localDate.getDayOfWeek()
            4-  localDate.getDayOfMonth()
            5-  localDate.getDayOfYear()

        has an isBefore method
        that compares if a date is before another date

        has an isAfter method
        that compares if a date is after another date

        has an isEqual method
        that compares if a date is equal to an another date

        has a plusDays(int days) method
        that adds to the object a number of days


        has a minusDays() method
        that removes to the object a number of days

    2- LocalTime class
        create object:
        1- LocalTime.now();
        2- LocalTime.of(int hour,int minute,int seconds);
            you can get:
            1-  localTime.getSecond()
            2-  localTime.getMinute()
            3-  localTime.getHour()

    3- LocalDateTime class
        create object:
        1- LocalDateTime.now();
        2- LocalDateTime.of(LocalDate ld, LocalTime lt);
