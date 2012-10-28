(ns looping-is-recursion)

(defn power [base exp]
  (if (zero? exp)
    1
    (* base (power base (dec exp))))
  )

(defn last-element [a-seq]
  (if (empty? a-seq) nil
    (if (empty? (rest a-seq))
      (first a-seq)
      (recur (rest a-seq))))
  )

(defn seq= [seq1 seq2]
  (loop [A seq1 B seq2]
    (cond
      (and (empty? A) (empty? B)) true
      (or (empty? A) (empty? B)) false
      (not (= (first A) (first B))) false
      :else 
        (recur (rest A) (rest B))))
  )

(defn find-first-index [pred a-seq]
  (loop [p pred n 0 s a-seq]
    (cond
     (empty? s) nil
     (pred (first s)) n
     :else
       (recur p (+ n 1) (rest s))))
  )

(defn avg [a-seq]
   (loop [sum 0 seq1 a-seq n (count a-seq)]
      (if (= (count seq1) 0)
       (/ sum n)
       (recur (+ sum (first seq1)) (rest seq1) n)))
)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])