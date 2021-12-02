#!/bin/bash

directory=$(pwd)
cd ~/ubung*/src

echo "Directory: $(pwd)"

echo 'rm */*.class'
rm */*.class

echo 'javac exercise8/Utils.java exercise8/Point.java exercise8/PointDemo.java'
javac exercise8/Utils.java exercise8/Point.java exercise8/PointDemo.java

echo 'java -ea exercise8.PointDemo'
echo -e "\U0001f680 \U0001f648 \U0001f649 \U0001f64A \U0001f680"
java -ea exercise8.PointDemo

cd $directory