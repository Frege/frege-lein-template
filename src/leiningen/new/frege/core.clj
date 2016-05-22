(ns {{name}}.core
  (:gen-class)
  ;; import the Frege main class (module)
  (:import Fibonacci))

(defn -main
  "I am a Clojure main that calls Frege code."
  [& args]
  (println "Hello, World!")
  (doseq [n (range 10)]
    (println "Fibonacci number" n "is"
             ;; Java 7 compatible Frege; pass lazy long
             (Fibonacci/fib (frege.run7.Thunk/lazy n))
             "(called via lazy fib)")
    (println "Fibonacci number" n "is"
             (Fibonacci/fib$tick n)
             "(called via eager fib')")))
