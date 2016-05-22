(ns {{name}}.core-test
  (:require [clojure.test :refer :all]
            [{{name}}.core :refer :all])
  ;; import the Frege code you want to test
  (:import Fibonacci))

(deftest test-fib
  (is (= 0 (Fibonacci/fib (frege.run7.Thunk/lazy 0))))
  (is (= 1 (Fibonacci/fib (frege.run7.Thunk/lazy 1))))
  (is (= 1 (Fibonacci/fib (frege.run7.Thunk/lazy 2))))
  (is (= 55 (Fibonacci/fib (frege.run7.Thunk/lazy 10)))))

(deftest test-fib'
  (is (= 0 (Fibonacci/fib$tick 0)))
  (is (= 1 (Fibonacci/fib$tick 1)))
  (is (= 1 (Fibonacci/fib$tick 2)))
  (is (= 55 (Fibonacci/fib$tick 10))))
