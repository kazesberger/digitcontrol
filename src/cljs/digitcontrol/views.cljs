(ns digitcontrol.views
  (:require [re-frame.core :as re-frame]
            [re-com.core :as re-com]
            [digitcontrol.subs :as subs]
            ))

(defn title []
  (let [name (re-frame/subscribe [::subs/name])]
    [re-com/title
     :label (str "Hello from " @name)
     :level :level1]))

((defn helloworld
  "docstring"
  []
  "this is a test: hello world!"))

(defn main-panel []
  [re-com/v-box
   :height "100%"
   :children [[title]]])
