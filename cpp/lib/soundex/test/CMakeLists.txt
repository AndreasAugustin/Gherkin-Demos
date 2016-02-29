cmake_minimum_required(VERSION 3.3)
project(gherkin-demo-test)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(CMAKE_MODULE_PATH ${CMAKE_MODULE_PATH} "${CMAKE_CURRENT_LIST_DIR}/../../../cmake/modules")

find_package(GMock REQUIRED)
find_package(Cucumber-Cpp REQUIRED)

include_directories(
        ${CUKE_INCLUDE_DIRS}
        ${CMAKE_CURRENT_LIST_DIR}/../include)

include_directories(${GTEST_INCLUDE_DIRS} ${Cucumber-Cpp_INCLUDE_DIRS})

add_executable(FeatureShowcaseSteps
        ${CMAKE_CURRENT_LIST_DIR}/features/step_definitions/soundexGherkinTestSteps.cpp)

target_link_libraries(FeatureShowcaseSteps
        cucumber-cpp
        gherkin_demo_lib)



