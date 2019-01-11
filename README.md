---
title: JAX-WS与JAX-RS的区别
date: "2017-02-07"
---

####一、名称概述
JAX-WS：全称是JavaTM API forXML-Based Web Services
JAX-RS :全称是 JavaTM API forRESTful Web Services

关于JAX-WS与JAX-RS两者是不同风格的[SOA](https://www.martinfowler.com/bliki/ServiceOrientedAmbiguity.html)架构。
前者以动词为中心，指定的是每次执行函数。
而后者以名词为中心，每次执行的时候指的是资源。

####二、JAX-WS与JAX-RS的区别
#####JAX-RS

JAX-RS是JAVA EE6 引入的。

JAX-RS即Java API for RESTful Web Services，是一个Java 编程语言的应用程序接口，支持按照表述性状态转移[REST](https://en.wikipedia.org/wiki/Representational_state_transfer)架构风格创建Web服务。

JAX-RS使用了Java SE5引入的Java标注来简化Web服务的客户端和服务端的开发和部署。

JAX-RS提供了一些标注将一个资源类，一个POJO Java类，封装为Web资源。

标注包括：

@Path，标注资源类或者方法的相对路径

@GET，@PUT，@POST，@DELETE，标注方法是HTTP请求的类型。

@Produces，标注返回的MIME媒体类型

@Consumes，标注可接受请求的MIME媒体类型

@PathParam，@QueryParam，@HeaderParam，@CookieParam，@MatrixParam，@FormParam,分别标注方法的参数来自于HTTP请求的不同位置，例如@PathParam来自于URL的路径，@QueryParam来自于URL的查询参数，@HeaderParam来自于HTTP请求的头信息，@CookieParam来自于HTTP请求的Cookie。

基于JAX-RS实现的框架有Jersey，RESTEasy等。这两个框架创建的应用可以很方便地部署到Servlet 容器中，比如Tomcat，JBoss等。值得一提的是RESTEasy是由JBoss公司开发的，所以将用RESTEasy框架实现的应用部署到JBoss服务器上，可以实现很多额外的功能。

#####JAX-WS
JAX-WS规范是一组XML web services的JAVA API，JAX-WS允许开发者可以选择RPC-oriented或者message-oriented 来实现自己的web services。

在 JAX-WS中，一个远程调用可以转换为一个基于XML的协议例如SOAP，在使用JAX-WS过程中，开发者不需要编写任何生成和处理SOAP消息的代码。JAX-WS的运行时实现会将这些API的调用转换成为对应的SOAP消息。

在服务器端，用户只需要通过Java语言定义远程调用所需要实现的接口SEI（service endpoint interface），并提供相关的实现，通过调用JAX-WS的服务发布接口就可以将其发布为WebService接口。

在客户端，用户可以通过JAX-WS的API创建一个代理（用本地对象来替代远程的服务）来实现对于远程服务器端的调用。

当然 JAX-WS 也提供了一组针对底层消息进行操作的API调用，你可以通过Dispatch 直接使用SOAP消息或XML消息发送请求或者使用Provider处理SOAP或XML消息。

通过web service所提供的互操作环境，我们可以用JAX-WS轻松实现JAVA平台与其他编程环境（.net等）的互操作。

>JAX-WS与JAX-RPC之间的关系

Sun最开始的web services的实现是JAX-RPC 1.1 (JSR 101)。这个实现是基于Java的RPC,并不完全支持schema规范，同时没有对Binding和Parsing定义标准的实现。

JAX-WS2.0 (JSR 224)是Sun新的web services协议栈，是一个完全基于标准的实现。在binding层，使用的是the Java Architecture for XML Binding (JAXB, JSR 222)，在parsing层，使用的是the Streaming API for XML (StAX, JSR 173)，同时它还完全支持schema规范。

附：用CXF实现两者的一个Demo
https://github.com/dogiant/cxf-demo


@(随笔记录)[JAX-WS, JAX-RS, WebService]

 
