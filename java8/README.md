#java 8 was a game changer in java world
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

-----------------------------------------------------


    2- lambda is and anonymous function means withoud name
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