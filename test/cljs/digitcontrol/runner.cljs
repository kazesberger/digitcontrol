(ns digitcontrol.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [digitcontrol.core-test]))

(doo-tests 'digitcontrol.core-test)
