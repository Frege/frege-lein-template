(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "Example Clojure / Frege mixed language application"
  :url "http://example.com/FIXME"
  ;; Clojure is typically an EPL license
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  ;; Frege is typically a BSD license
  ;; :license {:name "BSD 3-clause"
  ;;           :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [;; Clojure runtime for mixed Clojure / Frege projects:
                 [org.clojure/clojure "1.7.0"]
                 ;; need to depend on Frege for runtime:
                 [org.frege-lang/frege "3.23.442-SNAPSHOT"]]
  :repositories {"sonatype" "https://oss.sonatype.org/content/repositories/snapshots/"}
  :plugins [[lein-fregec "3.23.442"]]
  :source-paths ["src/clj"]
  :test-paths ["test/clj"]
  :frege-source-paths ["src/frege"]
  :main {{name}}.core
  :profiles {:uberjar {:aot :all
                       :prep-tasks ["fregec" "compile"]}})
