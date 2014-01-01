# TA-Lib: Technical Analysis Library

## Multi-Platform Tools for Market Analysis
TA-Lib is widely used by trading software developers requiring to perform technical analysis of financial market data.

* Includes 200 indicators such as ADX, MACD, RSI, Stochastic, Bollinger Bands etc... ([more info](http://ta-lib.org/function.html))
* Candlestick pattern recognition
* Open-source API for C/C++, Java, Perl, Python and 100% Managed .NET (**This git repository is a Java-only mirror with Maven support**)

## Free Open-Source Library
TA-Lib is available under a BSD License allowing it to be integrated in your own open-source or commercial application. ([more info](http://ta-lib.org/hdr_dev.html))

## Commercial Application
TA-Lib is also available as an easy to install Excel Add-Ins. [Try it for free](http://ta-lib.org/hdr_dw.html)!

## Use with Maven

[![Build Status](https://travis-ci.org/BYVoid/TA-Lib.png?branch=travis)](https://travis-ci.org/BYVoid/TA-Lib)

```xml
<dependency>
  <groupId>com.tictactec</groupId>
  <artifactId>ta-lib</artifactId>
  <version>0.4.0</version>
</dependency>
<dependency>
  <groupId>com.tictactec</groupId>
  <artifactId>ta-lib</artifactId>
  <version>0.4.0</version>
  <classifier>javadoc</classifier>
</dependency>
<dependency>
  <groupId>com.tictactec</groupId>
  <artifactId>ta-lib</artifactId>
  <version>0.4.0</version>
  <classifier>sources</classifier>
</dependency>
```

You can also have Maven installed, and run `mvn package` in this respository.

## Use with Scala sbt

Add below to your `build.sbt`:

```scala
libraryDependencies += "com.tictactec" % "ta-lib" % "0.4.0"
```

## Contributors

* Original author: Mario Fortier
* Maven packager: Carbo Kuo
