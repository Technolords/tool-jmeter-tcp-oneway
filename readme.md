# TCP handler for Jmeter with a twist

## Introduction
Out of the box JMeter comes with a variety of samplers to simulate traffic such as HTTP, JMS and more. For TCP
these samplers are quite limited and this projects addresses this aspect somewhat. The standard TCP handler
expects some kind of a response and waits for it to arrive (like common HTTP request and response). In scenario's
where there is only one way direction of data flow this becomes a problem as Jmeter considers this a failure as
nothing comes back.

This sampler is different, and is designed to write data only (i.e. send) and skips any reads. This type of TCP
handler supports use cases such as proxy and relay type of applications.

## References
The table below provides some short cut links (sorted by alphabet).

Reference | Remarks
----------|--------
[Wiki](https://github.com/Technolords/tool-jmeter-tcp-oneway/wiki) | Home page (wiki)
