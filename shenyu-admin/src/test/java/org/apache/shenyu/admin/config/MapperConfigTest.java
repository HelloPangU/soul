/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.admin.config;

import org.apache.shenyu.admin.mybatis.pg.interceptor.PostgreSqlQueryInterceptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Test cases for {@link MapperConfig}.
 */
@RunWith(MockitoJUnitRunner.Silent.class)
public class MapperConfigTest {

    @InjectMocks
    private MapperConfig mapperConfig;
    
    @Test
    public void testPostgreSqlQueryInterceptor() {
        PostgreSqlQueryInterceptor postgreSqlQueryInterceptor = mapperConfig.postgreSqlQueryInterceptor();
        assertNotNull(postgreSqlQueryInterceptor);
    }
}
