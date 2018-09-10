(ns exercise7-test-guia
  (:require [clojure.test :refer :all]
              [exercise7 :refer :all]))

(deftest tercer-elemento
  (testing "Extrae el tercer elemento de una lista"
   (is (= (enesimo 2 '(4 5 6 7)) 6))))
   
(deftest primer-elemento
  (testing "Extrae el primer elemento de una lista"
   (is (= (enesimo 0 [:a :b :c]) :a ))))
			    
(deftest segundo-elemento
  (testing "Extrae el segundo elemento en una lista"
   (is (= (enesimo 1 [1 2 3 4]) 2))))

(deftest tercer-par
  (testing "Extrae el tercer par en una lista de pares"
    (is (= (enesimo 2 '([1 2] [3 4] [5 6])) [5 6]))))
