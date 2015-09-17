# Sample app to show Strict DMI in action

Start Jetty with Maven (`mvn jetty:run`) and visit the follwoing urls:

 - http://localhost:8080/index -> you will be redirected to hello.action
 - http://localhost:8080/index!secure -> you will get warning that `secure` method isn't allowed
 - http://localhost:8080/index!unsecure -> you will get a page with `Unsecure` header (action level `@AllowedMethods`)
 - http://localhost:8080/hello!global -> you will get a page with `Global` header (package level `@AllowedMethods`)  
