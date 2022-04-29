#/bin/bash
javac Main.java
java Main < sample.in > prueba.out
diff prueba.out sample.out -b
