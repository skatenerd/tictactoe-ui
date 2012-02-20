(on-mouse-clicked [e]
  (if (and
        (production/radio-buttons-value (find-by-id (scene e) "x-type-selection"))
        (production/radio-buttons-value (find-by-id (scene e) "o-type-selection")))
    (open-scene (production e) "board_view" "main" {})))