set(CUKE_SOURCES
    ${CMAKE_CURRENT_LIST_DIR}/ContextManager.cpp
    ${CMAKE_CURRENT_LIST_DIR}/CukeCommands.cpp
    ${CMAKE_CURRENT_LIST_DIR}/CukeEngine.cpp
    ${CMAKE_CURRENT_LIST_DIR}/CukeEngineImpl.cpp
    ${CMAKE_CURRENT_LIST_DIR}/StepManager.cpp
    ${CMAKE_CURRENT_LIST_DIR}/HookRegistrar.cpp
    ${CMAKE_CURRENT_LIST_DIR}/Regex.cpp
    ${CMAKE_CURRENT_LIST_DIR}/Scenario.cpp
    ${CMAKE_CURRENT_LIST_DIR}/Table.cpp
    ${CMAKE_CURRENT_LIST_DIR}/Tag.cpp
    ${CMAKE_CURRENT_LIST_DIR}/connectors/wire/WireServer.cpp
    ${CMAKE_CURRENT_LIST_DIR}/connectors/wire/WireProtocol.cpp
    ${CMAKE_CURRENT_LIST_DIR}/connectors/wire/WireProtocolCommands.cpp
    ${CMAKE_CURRENT_LIST_DIR}/drivers/GTestDriver.cpp
)

include_directories(${GTEST_INCLUDE_DIRS})

if(CMAKE_EXTRA_GENERATOR OR MSVC_IDE)
    message(STATUS "Adding header files to project")
    file(GLOB_RECURSE CUKE_HEADERS "${CUKE_INCLUDE_DIR}/cucumber-cpp/*.hpp")
    if(MSVC_IDE)
        source_group("Header Files" FILES ${CUKE_HEADERS})
    endif()
    list(APPEND CUKE_SOURCES ${CUKE_HEADERS})
endif()

add_library(cucumber-cpp-nomain STATIC ${CUKE_SOURCES})
add_library(cucumber-cpp STATIC ${CUKE_SOURCES} main.cpp)

target_link_libraries(cucumber-cpp ${GMOCK_LIBRARY} ${Boost_LIBRARIES})
target_link_libraries(cucumber-cpp-nomain ${GMOCK_LIBRARY} ${Boost_LIBRARIES})
