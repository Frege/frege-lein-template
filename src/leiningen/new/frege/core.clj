(ns {{name}}.core
  (:gen-class)
  ;; import the Frege main class (module)
  (:import Fibonacci))

(defn -main
  "I am a Clojure main that calls Frege code."
  [& args]
  (println "Hello, World!")
  (doseq [n (range 10)]
    (println "Fibonacci number" n "is" (Fibonacci/fib n))))
