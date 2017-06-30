# TCP handler for Jmeter with a twist

## Introduction
Out of the box JMeter comes with a variety for samplers but TCP they are quite limited. In fact, it expects
some kind of a response and waits for it to arrive (like commong HTTP request and response).

This sampler is different, and is designed to write data only (i.e. send) and ignores any reads. This
type of TCP handler supports use cases such as proxy and relay type of applications.

## References
The table below provides some short cut links (sorted by alphabet).

Reference | Remarks
----------|--------
[Wiki](https://github.com/Technolords/tool-jmeter-tcp-oneway/wiki) | Home page (wiki)
