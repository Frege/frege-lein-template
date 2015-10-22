(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "Example pure Frege language application"
  :url "http://example.com/FIXME"
  ;; Frege is typically a BSD license
  :license {:name "BSD 3-clause"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [;; need to depend on Frege for runtime:
                 [org.frege-lang/frege "3.23.370-g898bc8c"]]
  :plugins [[lein-fregec "3.23.370"]]
  :frege-source-paths ["src/frege"]
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["fregec" "compile"]}})
