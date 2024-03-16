all: clean run

clean:
	./gradlew clean build

run:
	java -jar ./build/libs/$(shell ls ./build/libs/ | grep ".*SNAPSHOT.jar")
