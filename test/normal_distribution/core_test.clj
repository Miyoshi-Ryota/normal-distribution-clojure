(ns normal-distribution.core-test
  (:require [clojure.test :refer :all]
            [normal-distribution.core :refer :all]))

(defn- abs [n] (max n (- n)))

(deftest mean-test
  (testing "Sample value of mean is followed by specified mean"
    (let [big-number 10000000
          sample (repeatedly big-number (partial sample-normal-distribution 10 5))
          mean (/ (apply + sample) big-number)
          error 0.01]
      (println mean)
      (is (> error (abs (- 10 mean)))))))

(deftest variance-test
  (testing "FIXME, I fail."
    (let [big-number 10000000
          sample (repeatedly big-number (partial sample-normal-distribution 10 5))
          variance (/ (apply + (map #(Math/pow (- % 10) 2) sample))
                      big-number)
          error 0.01]
      (println variance)
      (is (> error (abs (- variance 5)))))))
