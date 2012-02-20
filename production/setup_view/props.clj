[:body
  [:wide-container [:title {:text "Please choose player options"}]]

  [:player-selection-col
   [:label {:text "Choose Player Type For X"}]
    (production/radio-buttons-container
      "Choose player type for X"
      "x-type-selection"
      :choices ["Human" "Easy AI" "Medium AI" "Unbeatable AI"])

   ]
  [:player-selection-col
   [:label {:text "Choose Player Type For O"}]
   (production/radio-buttons-container
     "Choose player type for O"
     "o-type-selection"
     :choices ["Human" "Easy AI" "Medium AI" "Unbeatable AI"])]

  [:wide-container
  [:button {:text "Start game"
            :on-mouse-clicked (fn [e] (open-scene (production e) "board_view" "main" {}))}]]

]