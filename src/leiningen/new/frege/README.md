# {{name}}

Example of Clojure / Frege mixed language project. Clojure main program calls Frege function.

## Usage

Run the Frege compiler and then run the Clojure application:

    lein do fregec, run

Run the Clojure tests (which exercise the Frege functions):

    lein do fregec, test

Run the Frege compiler and then run the Fibonacci main function:

    lein fregec :run Fibonacci

You can also package up all the Clojure and Frege code and their runtimes:

    lein uberjar

That produces a JAR file which you can run:

    java -jar target/{{name}}-0.1.0-SNAPSHOT-standalone.jar

## License

Copyright (c) 2015 Your Name

Distributed under the Eclipse Public License, the same as Clojure (or the BSD 3-clause License, the same as Frege).
