(ns leiningen.new.frege
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "frege"))

(defn frege
  "Create a mixed Clojure / Frege project template."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' frege project.")
    (->files data
             ["README.md" (render "README.md" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["project.clj" (render "project.clj" data)]
             ["src/clj/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["src/frege/{{sanitized}}/Fibonacci.fr" (render "Fibonacci.fr" data)]
             ["test/clj/{{sanitized}}/core_test.clj" (render "core_test.clj" data)])))
