(defn radio-buttons-container [text id & options]
  (prn options)
  (prn text)
  (let [options (apply hash-map options)]
   [:radio-buttons {:id id}
    (for [choice (:choices options)]
      [:radio-container
       [:radio-button {:players "radio-button" :id (str id ":" choice) :group id}]
       [:radio-label {:text choice}]])]))

(defn radio-buttons-value [input]
  (let [button-group (.get (.getButtonGroups (peer (scene input))) (id input))]
    (if-let [selected-radio-button (.getSelection button-group)]
      (last (seq (.split (.getId (.getParent selected-radio-button)) ":")))
      nil)))

(def current-player (atom "X"))