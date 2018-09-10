(ns exercise8-test-guia
  (:require [clojure.test :refer :all]
            [exercise8 :refer :all]))

(deftest separador1
  (testing "Separa en 2 una lista"
    (is (= (separador 3 [1 2 3 4 5 6]) [[1 2 3] [4 5 6]]))))

(deftest separador2
  (testing "Separa en 2 una lista"
    (is (= (separador 1 [:a :b :c :d]) [[:a] [:b :c :d]]))))

(deftest separador3
  (testing "Separa en 2 una lista"
    (is (= (separador 2 [[1 2] [3 4] [5 6]]) [[[1 2] [3 4]] [[5 6]]]))))

