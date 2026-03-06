# Purpose

The purpose of this repo is to store tech talk which introduces the use of GraalVM.

The presentation of the tech talk is available in `./presentation.html`.

# Build summaries

## graal-vm-app

### JIT mode

```sh
cd graal-vm-app
# To only build the app :
./gradlew :app:build
# To run the app :
./gradlew :app:run
```

### AOT mode

```sh
cd graal-vm-app
# To compile a native executable :
./gradlew :app:nativeCompile
# To run the native executable :
./gradlew :app:nativeRun
```

## jvm-app

```sh
cd jvm-app
# To build the app :
./gradlew :app:build
# To run the app :
./gradlew :app:run
```

## springboot-jvm

```sh
cd springboot-jvm
# To build the app :
./gradlew build
# To run the executable :
java -jar build/libs/demo-springboot-jvm-0.0.1-SNAPSHOT.jar
```

## springboot-graalvm

Note : We don't use the JIT build here because we focus on native build in this tech talk to compare with regular JVM projects.

```sh
cd springboot-graalvm
# To compile the native executable :
./gradlew nativeCompile
# To run the native executable :
./build/native/nativeCompile/demo-springboot-graalvm
```