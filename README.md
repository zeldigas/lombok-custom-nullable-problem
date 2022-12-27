This repository shows asymmetry in lombok handling of nullable annotations - well-known and custom ones when
using `lombok.addNullAnnotations` parameter

Repo contains 2 modules with logically equal code - one value class with nullable field and `package-info.java` file
that has defines all package classes as having non-null signatures and fields by default.

1. `spring` directory contains sample that uses nullability annotations from spring-core
2. `custom` directory contains sample that uses custom annotations that are just a copy of spring ones, line by line

All you need to do is just run `mvn clean package` and then inspect generated classes (e.g. with IDEA class viewer).

Expected behavior: as `lombok.addNullAnnotations` is configured `Nullable` annotation
for field `com.example.Sample.prop1` should be copied to constructor and getter

Actual behavior: this works for out of the box spring annotations, but does not work for custom annotations. At the same
time custom annotations are still used for generated equals, hashCode and toString methods that shows that they are
configured correctly and lombok is aware of them.