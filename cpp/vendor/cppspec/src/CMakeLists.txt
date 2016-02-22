#
# Copyright 2007 - 2009 Timo Puronen
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

set(CPPSPEC_SRCS
        SpecDoxReporter.cpp
        SpecificationRegistry.cpp
        SpecRunner.cpp
        Util.cpp
        SpecResult.cpp
        Timer.cpp
        Matcher.cpp
        JUnitReporter.cpp
        BoostTimer.cpp
        FileOutputStream.cpp
        ConsoleOutputStream.cpp)

include_directories("${CMAKE_CURRENT_LIST_DIR}/../include" ${Boost_INCLUDE_DIRS})

add_library(CppSpec SHARED ${CPPSPEC_SRCS})
target_link_libraries(CppSpec ${Boost_LIBRARIES})

