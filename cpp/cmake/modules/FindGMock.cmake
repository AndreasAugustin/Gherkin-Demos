
if(NOT GMock_FOUND)
    set(GMock_ROOT_DIR ${CMAKE_MODULE_PATH}/../../vendor/googletest-distribution/googlemock)
    add_subdirectory(${GMock_ROOT_DIR} gmock)
    set(GMock_INCLUDE_DIRS ${GMock_ROOT_DIR}/include)
    set(GMock_LIBRARY gmock)
    set(GMock_FOUND True)
endif()