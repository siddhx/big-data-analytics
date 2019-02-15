#!/usr/bin/env python
import sys

if __name__ == "__main__":
    current_key = None
    total = 0
    for line in sys.stdin:
        key, val = line.split("\t")
        val = int(val)
        
        # if my key is equal to current key, then i accumulate the count.
        if key == current_key:
            total += val
        else:
            if current_key is not None:
                sys.stdout.write("{}\t{}\n".format(current_key, total))
            current_key = key
            total = val
    if current_key: #ensure the last key is written out
         sys.stdout.write("{}\t{}\n".format(current_key, total))