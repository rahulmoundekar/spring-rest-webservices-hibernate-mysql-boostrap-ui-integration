# spring-rest-webservices-hibernate-mysql-boostrap-ui-integration
spring-rest-webservices-hibernate-mysql-boostrap-ui-integration

# Web services overview

A Web service, in very broad terms, is a method of communication between two applications or electronic devices over the World Wide Web (WWW). Web services are of two kinds: Simple Object Access Protocol (SOAP) and Representational State Transfer (REST).
  The REST stands for Representational State Transfer. REST is not a set of standards or rules, rather it is a style of software architecture. The applications which follow this architecture are referred to as RESTful
 
# REST vs. SOAP

There are significant differences between SOAP and RESTful web services. The bullets below break down the features of each web service based on personal experience.

### REST

RESTful web services are stateless. You can test this condition by restarting the server and checking if interactions survive.
For most servers, RESTful web services provide a good caching infrastructure over an HTTP GET method. This can improve the performance if the information the service returns is not altered frequently and is not dynamic.
Service producers and consumers must understand the context and content being passed along as there is no standard set of rules to describe the REST web services interface.
REST is useful for restricted-profile devices, such as mobile, for which the overhead of additional parameters are less (e.g., headers).
REST services are easy to integrate with existing websites and are exposed with XML so the HTML pages can consume the same with ease. There is little need to refactor the existing site architecture. As such, developers are more productive because they don't need to rewrite everything from scratch; instead, they just need to add on the existing functionality.
A REST-based implementation is simple compared to SOAP.
### SOAP

The Web Services Description Language (WSDL) describes a common set of rules to define the messages, bindings, operations and location of the service. WSDL is akin to a contract to define the interface that the service offers.
SOAP requires less plumbing code than REST services design (e.g., transactions, security, coordination, addressing and trust). Most real-world applications are not simple and support complex operations, which require conversational state and contextual information to be maintained. With the SOAP approach, developers don't need to write plumbing code into the application layer.
SOAP web services, such as JAX-WS, are useful for asynchronous processing and invocation.
SOAP supports several protocols and technologies, including WSDL, XSDs and WS-Addressing.
Consuming a web service via a database stored procedure allows users to straight away update a database with information from different sources. Users can also schedule a job at regular intervals to get data updated periodically in the database.  
  

Unlike SOAP which targets the actions, REST concerns more on the resources. REST locates the resources by using URL and it depends on the type of transport protocol(with HTTP - GET, POST, PUT, DELETE,...) for the actions to be performed on the resources. The REST service locates the resource based on the URL and performs the action based on the transport action verb. It is more of architectural style and conventions based.

  For Example: in a RESTful architecture, this URL http://{serverAddress}/students/studentRollno/07 can be used to:

To get student information by sending a REST call of GET type, and the service will return information of student with roll no as 07
The same service can also be used to update the student data, by sending in the new values as Form data in a PUT request.

# Using HTTP Methods: CRUD Operations
  Now how will the server identify that which request is for the GET operation and which request is for the DELETE operation for the same URI. The answer is, by checking the HTTP method parameter. The method for the first operation should be GET and for the second operation, it should be DELETE.

  The common HTTP methods are:

		GET
		POST
		PUT
		DELETE
There are some other methods that are rarely used like HEAD and OPTIONS. These HTTP methods have specific meaning and you typically use the right method for the right operation. Also while surfing the Internet, like when you are browsing a webpage you are actually using these methods automatically. When you type a URL in the address bar of your browser, the browser automatically issues a GET request to the browser. When u submit an HTML Form, the browser uses the POST request to do so. The idea is to use the right method depending on the operation.
