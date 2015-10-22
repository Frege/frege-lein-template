# {{name}}

Example of pure Frege language project.

## Usage

Run the Frege compiler and then run the Fibonacci main function:

    lein fregec :run Fibonacci

Run the Frege compiler and then run the tests:

    lein fregec :run frege.tools.Quick -v FibonacciTest

You can also package up the Frege code and its runtime:

    lein uberjar

That produces a JAR file which you can run:

    java -cp target/{{name}}-0.1.0-SNAPSHOT-standalone.jar Fibonacci

## License

Copyright (c) 2015 Your Name

Distributed under the BSD 3-clause License, the same as Frege.
