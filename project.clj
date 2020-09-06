(defproject mrcsce/normal-distribution "0.1.0"
  :description "This library is clojure library to sample from a normal distribution (gaussian distribution).
  See also: https://github.com/Miyoshi-Ryota/normal-distribution-clojure"
  :url "https://github.com/Miyoshi-Ryota/normal-distribution-clojure"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/mit-license.php"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :repositories [["clojars" {:url "https://clojars.org/repo" :sign-releases false}]]
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]]
  :repl-options {:init-ns normal-distribution.core})
