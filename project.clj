(defproject clj-excel "0.0.2"
  :description "Excel bindings for Clojure, based on Apache POI."
  :dependencies [
                 [org.clojure/clojure "1.5.1"]
                 [org.apache.poi/poi "3.10-FINAL"]
                 [org.apache.poi/poi-ooxml "3.10-FINAL"]]
  ;; lein with-profile dev cloverage [cloverage-opts]
  :profiles {:dev {:source-paths ["dev"]
                   :resource-paths ["test-resources"]
                   :plugins [[lein-cloverage "1.0.2"]]
                   :dependencies [[org.clojure/tools.namespace "0.2.4"]]
                   :global-vars {*print-length* 20}}
             :test {:resource-paths ["test-resources"]}}
  :global-vars {*warn-on-reflection* true})
