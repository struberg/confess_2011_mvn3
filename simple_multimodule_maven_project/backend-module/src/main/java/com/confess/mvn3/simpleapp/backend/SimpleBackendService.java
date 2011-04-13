/*
* Licensed to the Apache Software Foundation (ASF) under one
* or more contributor license agreements. See the NOTICE file
* distributed with this work for additional information
* regarding copyright ownership. The ASF licenses this file
* to you under the Apache License, Version 2.0 (the
* "License"); you may not use this file except in compliance
* with the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied. See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package com.confess.mvn3.simpleapp.backend;

/**
 * This is just a small simple test backend service for
 * showcasing the out of the box power of Apache Maven3
 */
public class SimpleBackendService
{
    private static final int MY_INT = 42;
    private static final int MY_OTHER_INT = 4711;

    public int getMyInt()
    {
        return MY_INT;
    }

    public int getAnotherInt()
    {
        return MY_OTHER_INT;
    }
}
