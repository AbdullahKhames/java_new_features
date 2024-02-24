#Java 9 new Features

    1- private methods in interface
        by default all methods in interface are public
        why private methods ? 
            to reuse the code inside interfaces
            Private interface methods are a feature of Java that 
            allows developers to define private methods (both static and non-static) 
            in an interface. This is useful for defining helper 
            methods that can be called from inside the declaring interface only.


    2- Try with resource enhancement
        resources can be declared outside try and then refer to it inside try

    3- streams enhancement
        1- takeWhile
            it will stop if condition is flase for any value
        2- dropWhile
            it will start if condition is flase  for any value
        3- ofNullable
            ir prevents null pointer exception

    4- process API
        ProcessHandle.of(int pid);
        ProcessHandle.current();

    5- jshell: used to demo a small program

    6- JPMS:
        the main purpose is modularity
        java application development is based on moudules
        no more rt.jar since modules came out in java 9
    
    difference between jar and modules
        jar is classes and interfaces
        module is classes and interfaces and configuration data.
        this configuration data you have to specify in your module-info.java
    
    7- jLink:
        is used to create custom JRE
