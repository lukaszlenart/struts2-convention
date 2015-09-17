# Sample app to show Strict DMI in action

[![Build Status](https://travis-ci.org/lukaszlenart/struts2-convention.svg?branch=master)](https://travis-ci.org/lukaszlenart/struts2-convention)

Start Jetty with Maven ie. `mvn jetty:run` and visit the follwoing urls:

 - [http://localhost:8080/index](http://localhost:8080/index) -> you will be redirected to hello.action
 - [http://localhost:8080/index!secure](http://localhost:8080/index!secure) -> you will get warning that `secure` method isn't allowed
 - [http://localhost:8080/index!unsecure](http://localhost:8080/index!unsecure) -> you will get a page with `Unsecure` header (action level `@AllowedMethods`)
 - [http://localhost:8080/hello!global](http://localhost:8080/hello!global) -> you will get a page with `Global` header (package level `@AllowedMethods`)  
