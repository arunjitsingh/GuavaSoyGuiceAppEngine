# Many things

Trying out various Java-based application technologies for creating
applications. This uses, following from the name, [Guava][guava], [Soy][soy],
[Guice][guice] and [App Engine][appengine].

## Build and run

### Required libraries:

* aopalliance.jar
* appengine-api-1.0-sdk-1.7.4.jar
* appengine-api-labs.jar
* appengine-endpoints.jar
* appengine-jsr107cache-1.7.4.jar
* guava-14.0-rc2.jar
* guice-3.0.jar
* guice-assistedinject-3.0.jar
* guice-grapher-3.0.jar
* guice-jmx-3.0.jar
* guice-jndi-3.0.jar
* guice-multibindings-3.0.jar
* guice-persist-3.0.jar
* guice-servlet-3.0.jar
* guice-spring-3.0.jar
* guice-struts2-plugin-3.0.jar
* guice-throwingproviders-3.0.jar
* javax.inject.jar
* jsr107cache-1.1.jar
* soy-excluding-deps-latest.jar

Find these in the links above (4 downloads: guice-3.0, closure-templates,
guava-14.0-rc2, and GPE). Put these in `war/WEB-INF/lib`.

Also required:
* SoyParseInfoGenerator.jar

Put this in `bin/`.

```
$ ./build.sh
```

This builds SoyTemplateInfo for Soy files under
`src/net/arunjitsingh/gsgae/templates` and puts them in the package
`src.net.arunjitsingh.gsgae.soy`.

For the actual build, I haven't yet created any scripts (probably will use
[Maven][maven]). So far, Eclipse does a decent job of building the application
(with [GPE][gpe]).


[guava]: https://code.google.com/p/guava-libraries/ "Guava Libraries"
[soy]: https://developers.google.com/closure/templates/ "Closure Templates"
[guice]: https://code.google.com/p/google-guice/ "Google Guice"
[appengine]: https://developers.google.com/appengine/ "Google App Engine"
[maven]: https://maven.apache.org "Apache Maven"
[gpe]: https://developers.google.com/eclipse/ "Google Plugin for Eclipse"
