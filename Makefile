GRADLE=./gradlew
JAVA=java
SILENCE= --console=plain

.PHONY: build run

devrun:
	$(GRADLE) :run $(SILENCE)

buildjar:
	$(GRADLE) fatjar $(SILENCE)

launch4j:
	$(GRADLE) createExe $(SILENCE)

run: 
	$(JAVA) -jar build/lib/slate-all.jar

test:
	$(GRADLE) test

javadoc:
	# Build project
	$(GRADLE) assemble $(SILENCE)

	# Generate Javadoc
	$(GRADLE) javadoc $(SILENCE)

	# Make dir for use by GitHub
	rm -rf docs
	mkdir docs

	# Move the javadoc over
	mv build/reports/docs/* docs/

	# Solve a JS bug with Javadoc
	sed -i 's/useModuleDirectories/false/g' docs/search.js

package:
	# Bundle as a fatjar
	@$(MAKE)  buildjar

	# Build EXE
	@$(MAKE)  launch4j

	# Copy all files to the package
	rm -rf output
	mkdir output
	cp build/libs/slate-all.jar output/

	# Copy EXE to the package
	# cp -r build/launch4j output/slate-windows
	zip -r output/slate-windows.zip build/launch4j
