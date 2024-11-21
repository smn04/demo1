#!/bin/bash

# Exit immediately if a command exits with a non-zero status
set -e

# Define file name and directories
JAVA_FILE="add.py"
JAVA_FILE1="test_add.py"

# Step 1: Clean previous builds (if any)
echo "Cleaning previous builds..."

echo "Running the python file"
echo "Testing the python file"
python $JAVA_FILE1

# Step 4: Cleanup (optional)
# rm -f "$CLASS_FILE"
