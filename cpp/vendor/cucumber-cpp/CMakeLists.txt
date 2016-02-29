cmake_minimum_required(VERSION 2.8.12)

project(Cucumber-Cpp)

set(CUKE_DISABLE_GTEST OFF CACHE BOOL "Disable Google Test framework")
set(CUKE_DISABLE_FUNCTIONAL OFF CACHE BOOL "Disable Functional Tests")
set(VERBOSE OFF CACHE BOOL "Verbose output")

#
# Generic Compiler Flags
#

if(CMAKE_COMPILER_IS_GNUCXX)
    set(CMAKE_CXX_FLAGS_DEBUG "${CMAKE_CXX_FLAGS_DEBUG} -Weffc++")
    # TODO: A better fix should handle ld's --as-needed flag 
    set(CMAKE_EXE_LINKER_FLAGS "${CMAKE_EXE_LINKER_FLAGS} -Xlinker '--no-as-needed'")
elseif(MSVC)
    set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -DNOMINMAX") # exclude M$ min/max macros
    #set(CMAKE_CXX_FLAGS_DEBUG "${CMAKE_CXX_FLAGS_DEBUG} /analyze")
endif()

#
# Boost
#
find_package(Boost REQUIRED COMPONENTS thread system regex date_time)

find_package(GMock REQUIRED)

#
# Cucumber-Cpp
#

include_directories(
        ${CMAKE_CURRENT_LIST_DIR}/include
        ${GMOCK_INCLUDE_DIRS}
        ${BOOST_INCLUDE_DIRS})

set(CUKE_LIBRARIES cucumber-cpp)

add_subdirectory(src)


