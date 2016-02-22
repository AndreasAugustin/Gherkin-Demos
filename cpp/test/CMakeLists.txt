cmake_minimum_required(VERSION 3.3)
project(gherkin-demo-test)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(CMAKE_MODULE_PATH ${CMAKE_MODULE_PATH} "${CMAKE_CURRENT_LIST_DIR}/../cmake/modules")

find_package(CppSpec)
find_package(Cucumber-Cpp)

