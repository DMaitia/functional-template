(ns exercise2)

(defn only-greater-than-five
     [lista]
     (filter (fn [x]
                  (> x 5)) lista))
