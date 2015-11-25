# frege-lein-template

A Leiningen template for creating new (mixed language) Clojure / Frege projects.

## Usage

    lein new frege myapp

This will create a folder called `myapp` containing the skeleton of a pure Frege project with a Frege main function and tests. See the generated `README.md` for details of how to run the program and tests.

    lein new frege myapp -- :with-clojure

This will create a folder called `myapp` containing the skeleton of a Frege project with a Clojure main function and Clojure tests. See the generated `README.md` for details of how to run the tests, how to run the Clojure / Frege project, and how to run the Frege code as a standalone app.

## License

Copyright © 2015 Sean Corfield / Frege

Distributed under the BSD 3-clause License, the same as Frege itself.
