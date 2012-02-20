(defproject tictactoe-ui "1.0.0-SNAPSHOT"
  :description "UI for TTT"
  :dependencies [[org.clojure/clojure "1.2.0"]
                 [limelight/limelight "0.6.12"]
                 [limelight/limelight-clj "0.6.14"]
		 [tictactoe "1.0.0-SNAPSHOT"]]
  :dev-dependencies [[speclj "2.1.1"]
		     [limelight/limelight-clj "0.6.14"]]
  :test-path "spec/")
