JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	@$(JC) $(JFLAGS) $*.java

CLASSES = *.java

default: classes archive
	@java App

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class archive.zip

.PHONY: archive
archive:
	@zip -r archive.zip *.java > /dev/null
