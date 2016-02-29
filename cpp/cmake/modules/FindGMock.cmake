
if(NOT GMOCK_FOUND)
    set(GOOGLETEST_DISTRIBUTION_ROOT_DIR ${CMAKE_MODULE_PATH}/../../vendor/googletest-distribution)
    set(GMOCK_ROOT_DIR ${GOOGLETEST_DISTRIBUTION_ROOT_DIR}/googlemock)
    add_subdirectory(${GMOCK_ROOT_DIR} gmock)
    set(GMOCK_INCLUDE_DIRS ${GMOCK_ROOT_DIR}/include)
    set(GMOCK_LIBRARY gmock)
    set(GMOCK_FOUND True)

    set(GTEST_INCLUDE_DIRS ${GOOGLETEST_DISTRIBUTION_ROOT_DIR}/googletest)
    set(GTEST_LIBRARY gtest)
    set(GTEST_FOUND True)
endif()