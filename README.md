# TestCondiviso
Questa repo è una repo di test

## 🚀 Compile and Run
Here are the instructions to compile and run the program.


### WINDOWS

Compile the source code:
```
javac -cp "lib/*" -d bin src/**/*.java
```
Run:
```
java -cp "bin;lib/*" Main
```

### Linux/MacOS
Compile the source code:
```
javac -cp "lib/*" -d bin $(find src -name "*.java")
```
Run:
```
java -cp "bin:lib/*" Main
```
