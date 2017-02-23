JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = *.java

default: classes
	java App

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class