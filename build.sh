#!/bin/bash

# Exit immediately if a command exits with a non-zero status
set -e

# Define file name and directories
JAVA_FILE="add.java"
CLASS_FILE="add.class"

# Step 1: Clean previous builds (if any)
echo "Cleaning previous builds..."
rm -f "$CLASS_FILE"

# Step 2: Compile the Java file
echo "Compiling $JAVA_FILE..."
javac "$JAVA_FILE"

# Step 3: Run the compiled Java class
echo "Running the compiled Java class..."
java add

# Step 4: Cleanup (optional)
# rm -f "$CLASS_FILE"
