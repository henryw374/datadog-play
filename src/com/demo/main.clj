(ns com.demo.main
  (:gen-class))

(defn- wait-for-exit! []
  (.join (Thread/currentThread)))

(defn -main [& args]
  
  (println "yay")
  (wait-for-exit!))

(comment 
  (require '[com.demo.foo :as f])
  f/x
  )
