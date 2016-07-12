(defproject gov.usgs.eros/lcmap-client-clj "0.5.0-SNAPSHOT"
  :description "Clojure Client for USGS LCMAP REST Service"
  :url "https://github.com/USGS-EROS/lcmap-client-clj"
  :license {:name "NASA Open Source Agreement, Version 1.3"
            :url "http://ti.arc.nasa.gov/opensource/nosa/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.match "0.3.0-alpha4"]
                 [org.clojure/core.memoize "0.5.9"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/tools.logging "0.3.1"]
                 [clojusc/twig "0.2.1"]
                 ;;[ch.qos.logback/logback-classic "1.1.3"]
                 [com.stuartsierra/component "0.3.1"]
                 [clj-http "3.1.0"]
                 [dire "0.5.4"]
                 [leiningen-core "2.6.1"]
                 [clojure-ini "0.0.2"]
                 ;; LCMAP Components
                 [gov.usgs.eros/lcmap-config "0.5.0-SNAPSHOT"]
                 [gov.usgs.eros/lcmap-logger "0.5.0-SNAPSHOT"]]
  :repl-options {:init-ns lcmap.client.dev}
  :profiles {
    :dev {
      :env {
        :log-level :trace
        :logging-namespaces [lcmap.client]}
      :dependencies [[org.clojure/tools.namespace "0.3.0-alpha3"]
                     [pandect "0.6.0"]
                     [slamhound "1.5.5"]]
      :plugins [[lein-kibit "0.1.2"]]
      :aliases {"slamhound" ["run" "-m" "slam.hound"]}
      :source-paths ["dev-resources/src"]}
    :testing {
      :env {
        :log-level :info}}})
