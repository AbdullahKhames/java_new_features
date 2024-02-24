#Java 7 New features

1- multi catch:
    allows multiple exceptions to be handled in a single catch block
    with 1 reference separated by a pipe operator

    why we need it?
        due to before the multi catch we had some problems like: 
            verbose code
            reduntant code
            less readable

    it is used if we have common handling for a set of exception types
    without using a general exception

2- try with resources (special try)
    manges resources implicitly so no need for developer to close resources
    creating it:
        by creating the autocloseable object in the try parenthesis ()
        then the resources will be closed implicitly when the try block ends
        (like python's context manager)
        
    why we need it?
        due to before the try with resources we had some problems like:
            developer must close the resources or memory leak will occur
            must check not null before closing!
            unnecessary fiunally block used to close resources
            verbose code
        
        
3- diamond operator <>
    
    why we need it?
        to avoid code redundancy
        no need to specify data type in the right hand side 
        because compiler can infere the data type
        based on the left han type
        data type


4- underscore in numeric values
    100_000_000

    why we need it ?
        to increase readability

5- string in switch
    to handle string data type in switch statement
    since java 7 you can use strings as switch case

    why we need it ?
        to increase readability

6- NIO
    

    problems with old io.file api
        no proper exception handling
        performance issues
        verbose code
        complex code
        methods not consistent with all operating systems
        missing basic file operations
        limitid support of file attribute
        need to use output/input streams and need to close them to prevent memory leak

    
