cmake_minimum_required(VERSION 3.3)
project(gherkin-demo-test)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

find_package(Cucumber-Cpp QUIET)

if(NOT Cucumber-Cpp_FOUND)
    include(ExternalProject)
    ExternalProject_Add(Cucumber-Cpp
            #PREFIX ${sfml_PREFIX}
            GIT_REPOSITORY https://github.com/paoloambrosio/cucumber-cpp.git
            #INSTALL_DIR ${sfml_INSTALL_DIR}
            #CMAKE_ARGS ${sfml_CMAKE_ARGS}
            )
endif()