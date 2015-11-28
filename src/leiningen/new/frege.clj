(ns leiningen.new.frege
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "frege"))

(defn frege
  "Create a mixed Clojure / Frege project template.
  Supported arguments:
  :with-clojure -- base template should include Clojure main."
  [name & args]
  (let [with-clojure (= ":with-clojure" (first args))
        data {:name name
              :sanitized (name-to-path name)}]
    (main/info (str "Generating fresh 'lein new' frege project"
                    (when with-clojure
                      ", with Clojure entry point")
                    "."))
    (if with-clojure
      (->files data
               ["LICENSE-EPL" (render "EPL" data)]
               ["LICENSE-BSD" (render "BSD" data)]
               ["README.md" (render "README.md" data)]
               ["project.clj" (render "project.clj" data)]
               ["src/clj/{{sanitized}}/core.clj" (render "core.clj" data)]
               ["test/clj/{{sanitized}}/core_test.clj" (render "core_test.clj" data)]
               ["src/frege/{{sanitized}}/Fibonacci.fr" (render "Fibonacci.fr" data)])
      (->files data
               ["LICENSE" (render "BSD" data)]
               ["README.md" (render "README.pure.md" data)]
               ["project.clj" (render "project.pure.clj" data)]
               ["src/{{sanitized}}/Fibonacci.fr" (render "Fibonacci.fr" data)]
               ["test/{{sanitized}}/FibonacciTest.fr" (render "FibonacciTest.fr" data)]))))
