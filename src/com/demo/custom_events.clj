(ns com.demo.custom-events
  (:require [com.unbounce.dogstatsd.core :as statsd]
            [datadog.core :as dd]))

(dd/set-connection! {:host "localhost" :port 8126})

(comment

  (statsd/setup! :host "localhost" :port 8125)
  (statsd/event {:title "foo" :text "things are bad\nfoo"} nil)
  (defn service-check [service]
    (statsd/service-check {:name     "ping-check" :status :warning
                           :hostname "localhost"
                           :message  "failed to ping"} ["env:dev" "region:emea"
                                                                                  (str "service_id:" service)]))
  
  (service-check "jupiter")
  (service-check "titan")
  (service-check "io")

  (dd/increment "page.views")
  (dd/increment "page.views" 10)
  (dd/increment "error.count" {:page "products"})
  (dd/increment "active.connections" 3 {:service "db"})

  (dd/decrement "users.online")
  (dd/decrement "users.online" {:group "admins"})
  )




