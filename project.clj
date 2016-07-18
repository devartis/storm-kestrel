(defproject storm/storm-kestrel "1.0.4"
  :source-path "src/clj"
  :java-source-paths ["src/jvm"]
  :javac-options {:debug "true", :target "1.7", :source "1.7"}
  :dependencies [[org.apache.storm/storm-core "1.0.1"]
                 [commons-lang/commons-lang "2.5"]]
  :dev-dependencies [[org.apache.storm/storm-core "1.0.1"]
                     [commons-lang/commons-lang "2.5"]
                     [org.clojure/clojure "1.2.0"]
                     [org.clojure/clojure-contrib "1.2.0"]]
  :jvm-opts ["-Djava.library.path=/usr/local/lib:/opt/local/lib:/usr/lib"])
