#!/usr/bin/env python

import sys

if __name__ == "__main__":
    for line in sys.stdin:
        for word in line.split(): #line.strip().split() is better
            sys.stdout.write("{}\t1\n".format(word))
