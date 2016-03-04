Cpp this demo contains a usage for gherkin with cpp
===========

# Requirements
- Cmake
- Boost
- Ruby gem (for gherkin with the wire protocol)
    - cucumber
- Cppspec
- Google mock (included in package)
    - https://github.com/google/googletest
- Cucumber-Cpp (included in package)
    - https://github.com/paoloambrosio/cucumber-cpp

# Project setup (Linux with make)
     $ git clone https://github.com/AndreasAugustin/Gherkin-Demos.git
     $ cd cpp
     $ mkdir build
     $ cd build
     $ cmake ..
     $ make
     $ cd devel/lib/soundex/test
     $ ./FeatureShowcaseSteps &
     $ cd <git repo>/cpp/lib/soundex/test
     $ cucumber


# The soundex algorithm
The example in c++ is from book
    Modern C++ Programming with Test-Driven Development: Code Better, Sleep Better
    Jeff Langr
https://github.com/jlangr/
