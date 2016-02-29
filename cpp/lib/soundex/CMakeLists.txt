cmake_minimum_required(VERSION 3.3)
project(gherkin-demo-lib)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

include_directories(${CMAKE_CURRENT_LIST_DIR}/include)

add_library(gherkin_demo_lib
        ${CMAKE_CURRENT_LIST_DIR}/src/charutil.cpp
        ${CMAKE_CURRENT_LIST_DIR}/src/soundex.cpp
        ${CMAKE_CURRENT_LIST_DIR}/src/stringutil.cpp)

add_subdirectory(test)