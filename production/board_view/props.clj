(let
  [set-to-x (fn [e]
    ;(style= (prop e) "background-color" "#993344")
    (text= (prop e) "X"))]
  [:body
 [:wide-container [:title {:text "You are playing Tic Tac Toe"}]]
 [:board
  [:wide-container
   [:row
     [:ttt-square {:styles "unoccupied" :on-mouse-clicked set-to-x}]
     [:ttt-square {:styles "unoccupied" :on-mouse-clicked set-to-x}]
     [:ttt-square {:styles "unoccupied" :on-mouse-clicked set-to-x}]]]
   [:wide-container
  [:row
   [:ttt-square {:styles "unoccupied" :on-mouse-clicked set-to-x}]
   [:ttt-square {:styles "unoccupied" :on-mouse-clicked set-to-x}]
   [:ttt-square {:styles "unoccupied" :on-mouse-clicked set-to-x}]]]
  [:wide-container
  [:row
   [:ttt-square {:styles "unoccupied" :on-mouse-clicked set-to-x}]
   [:ttt-square {:styles "unoccupied" :on-mouse-clicked set-to-x}]
   [:ttt-square {:styles "unoccupied" :on-mouse-clicked set-to-x}]]]]
 [:wide-container
  [:button {:text "Reset"
            :on-mouse-clicked (fn [e] (open-scene (production e) "setup_view" "main" {}))}]]
 [:player-indicator {:text "It is X's Turn!"}]])