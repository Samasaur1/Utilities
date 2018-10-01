# Utilities [![Build Status](https://travis-ci.com/Samasaur1/Utilities.svg?branch=master)](https://travis-ci.com/Samasaur1/Utilities) [![](https://jitpack.io/v/Samasaur1/Utilities.svg)](https://jitpack.io/#Samasaur1/Utilities)
A collection of Java utilities

## Installation
If you use Gradle, Maven, SBT, or Leiningen, follow [this](https://jitpack.io/#Samasaur1/Utilities) guide.

Ant is also supported but does not have a guide.

If you want to download the library manually, head on over to the [Releases page](https://github.com/Samasaur1/Utilities/releases) and download the latest release.

## Implementation
Import `com.gauck.sam.Utilities.*;`

The main `Utilities` class should be used similarly to `java.lang.Math`. This means that users should call its static methods and not try to instantiate.

## Common Errors
### NoClassDefFoundError (Gradle)
If your stack trace looks like this: (the `at` lines will be different)
```
Exception in thread "main" java.lang.NoClassDefFoundError: com/gauck/sam/Utilities/Utilities
	at com.samgauck.CityManagement.Economy.<init>(Economy.java:14)
	at com.samgauck.CityManagement.Economy.getInstance(Economy.java:29)
	at com.samgauck.CityManagement.Command.<init>(Command.java:23)
	at com.samgauck.CityManagement.Command.getInstance(Command.java:46)
	at com.samgauck.CityManagement.Main.<clinit>(Main.java:44)
Caused by: java.lang.ClassNotFoundException: com.gauck.sam.Utilities.Utilities
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:338)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	... 5 more
```
add the line
```
from configurations.compile.collect { it.isDirectory() ? it : zipTree(it) }
```
to the jar block. However, this may cause this error:
```
Cannot change dependencies of configuration ':compile' after it has been resolved
```
In order to fix this, ensure that your dependencies block is before your jar block (and if you have a repositories block, that should be first).

See https://github.com/Samasaur1/CityManagement/issues/37 and https://github.com/Samasaur1/Utilities/issues/10
