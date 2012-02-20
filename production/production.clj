(defn radio-buttons-container [text id & options]
  (prn options)
  (prn text)
  (let [options (apply hash-map options)]
   [:radio-buttons {:id id}
    (for [choice (:choices options)]
      [:radio-container
       [:radio-button {:players "radio-button" :id (str id ":" choice) :group id}]
       [:radio-label {:text choice}]])]))