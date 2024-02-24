#JAVA 11 new features

removed features

A- modules
    java.corba
    jdk.snmp
    java.xml.ws
    java.xml.bind
    javafx

B- classes
    AWTUtilities
    defineClass

C- methods
    Thread.destroy()
    Thread.stop()

D- tools
    appletviewer Launcher
    wsimport
    wsgen
    schemagen
    Xjc -

    new features in strings in java 11:
        repeat(n);
        isBlank()
        lines()
        strip()
        stripLeading()
        stripTrailing()

    Nashorn:
        it is a javascript engine that is used to call javascript function from java but now removed


    HTTP Client
        introduced in java 9 but now in java.net.http
        used for calling webservices from java
        before the HTTPClient from java we used to call webservices using
            RestTemplate
            HTTPClient(Apache)
            HTTPClient(Google)
            HTTPURLConnection(JAVA)

        advantages:
            avoid dependency on any third-party libraries
            very simple
            can send both text and binary data
            can send multiple requests
            supports both sunchronous and asynchronous communications


    Lambda enhancements in java 11
        var in lambda input parameters
            to be able to declare the input parameter as final 
            to be able to add validation for the input @Min(value = 10)