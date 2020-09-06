(ns normal-distribution.core)

(defn sample-normal-distribution
  [mean variance]
  (let [standard-deviation (Math/sqrt variance)
        ri (repeatedly 12 rand)]
    (+ (* standard-deviation
          (- (apply + ri) 6))
       mean)))
