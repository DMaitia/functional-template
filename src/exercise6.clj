(ns exercise6)

(defn faverage
  [lista]
  (/ (reduce + lista) (count lista)))