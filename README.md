# spring-rest-webservices-hibernate-mysql-boostrap-ui-integration
spring-rest-webservices-hibernate-mysql-boostrap-ui-integration

  The REST stands for Representational State Transfer. REST is not a set of standards or rules, rather it is a style of software architecture. The applications which follow this architecture are referred to as RESTful

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
