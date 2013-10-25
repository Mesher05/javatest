![](https://raw.github.com/NobleEurope/javatest/master/noblelogo.gif)
## Java Developers Test

Thank you for your interest in the role at Noble.

We hope the test will not only test your abilities but also give you a little glimpse into some
of the tasks we carry out. You are welcome to use any resources that would be available to
you during the course of a normal day at Noble: e.g. Google is permitted, as are textbooks,
however use of existing code libraries you have developed anywhere else would not be
allowed. You may include code taken from the internet including JARs that are freely
downloadable and have no restrictions on usage within Noble. In other words, they must be
licensed for commercial use without restriction. You should clearly identify and attribute
sources within your code to their appropriate ownership.

One final word of warning - at Noble you will regularly gather your own requirements directly
or receive vague details by email. Sometimes it is not possible to get a very detailed
specification simply because the user doesn’t know or isn’t available. When this
happens you have to use your initiative and work things out for yourself. This test has several
ambiguities and vague definitions. It is up to you to make reasonable and valid assumptions.
Do not ask your recruitment consultant for help or advice as they know no more than you do.

And one final tip: KISS – Keep It Short and Simple. Don’t overcomplicate it, make it simple,
efficient, easy to maintain and easy for the user to use.

### Introduction to the problem

A large part of the role is dealing with applications and services that are receiving data,
processing it and publishing them back to other services through a enterprise bus.

In this hypothetical scenario, your usecase is to write a simple event orchestrator that might
receive lots of events from multiple sources, send it to one or more processors that might be
interested in the event, receive a processed event from the processor, collate all results
into an composite event and publish it to a publisher. The rough schematic for the workflow
is given below.

![](https://raw.github.com/NobleEurope/javatest/master/javatest.png)

All the necessary interfaces have been added to this github repository which you may download
to solve the problem. The following are the expectations

1. Implement only the `com.thisisnoble.javatest.Orchestrator` interface and any other
supporting code that is necessary (no need to implement Processor or Publisher interfaces).
2. Ensure that your code is multi-threaded and can potentially handle a large number of
events per minute.
3. Please support your code with unit-tests to prove it works.


### How to submit your work

First and foremost, please do not fork this project or blog about your solution. While we have
maintained to keep this test fairly open source, we would like other candidates to think
and try for themselves rather than copying your code and replacing variable names.

Once you have completed the test, copy all necessary files to a "private" GIST and send us the
link to your gist. Again the key is keep your GIST private.

Many thanks for taking your time to complete the test.