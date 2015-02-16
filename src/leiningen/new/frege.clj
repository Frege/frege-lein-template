(ns leiningen.new.frege
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "frege"))

(defn frege
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' frege project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
