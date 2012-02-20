[:body
 [:wide-container [:title {:text "You are playing Tic Tac Toe"}]]
 [:board
  [:wide-container
   [:row
     [:box {:styles "unoccupied" :on-mouse-clicked (fn [e] (style= (prop e) "background-color" "#993344"))}]
     [:box {:styles "unoccupied"}]
     [:box {:styles "unoccupied"}]]]
   [:wide-container
  [:row
   [:box {:styles "unoccupied"}]
   [:box {:styles "unoccupied"}]
   [:box {:styles "unoccupied"}]]]
  [:wide-container
  [:row
   [:box {:styles "unoccupied"}]
   [:box {:styles "unoccupied"}]
   [:box {:styles "unoccupied"}]]]]
 [:wide-container
  [:button {:text "Reset"
            :on-mouse-clicked (fn [e] (open-scene (production e) "setup_view" "main" {}))}]]
 [:player-indicator {:text "It is X's Turn!"}]]