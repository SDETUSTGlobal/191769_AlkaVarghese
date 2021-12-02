# Example:
import os
import shutil
from os import path

def main():
# make a duplicate of an existing file
 if path.exists("Python.txt"):
    # get the path to the file in the current directory
    src = path.realpath("Python.txt");

    # rename the original file
    os.rename('Python.txt', 'career.Python.txt')

if __name__ == "__main__":
    main()