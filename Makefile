GRADLE=./gradlew
JAVA=java

.PHONY: build run

devrun:
	$(GRADLE) :run --console=plain

buildjar:
	$(GRADLE) fatjar --console=plain

launch4j:
	$(GRADLE) createExe --console=plain

run: 
	$(JAVA) -jar build/lib/slate-all.jar

test:
	$(GRADLE) test

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
