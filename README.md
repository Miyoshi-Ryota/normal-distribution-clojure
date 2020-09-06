# normal-distribution

A Clojure library designed to sample from a normal distribution (gaussian distribution).

A below figure is plotting data sampled by this library.
![fig_sampling_normal_distribution](https://user-images.githubusercontent.com/23313273/92315814-44af8b00-f026-11ea-84ab-cfb87a034096.png)


## Usage
* Add :dependencies in your project.clj file.
    ```
    [mrcsce/normal-distribution "0.1.0"]
    ```
* Add :require in your clj file to import the library.
* Use a function `sample-normal-distribution` like a below.
```clojure
(ns your-project.core
  (:require [normal-distribution.core :as n]))

;; mean is usually written as mu in math formula.
(def mean 10.0)

;; variance is usually written as sigma^2 in math formula. 
(def variance 5.0)

(n/sample-normal-distribution mean variance)
;; => 10.174479480082978
```

## License

MIT License

Copyright 2020 Ryota Miyoshi

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

