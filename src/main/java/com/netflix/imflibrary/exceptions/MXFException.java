/*
 *
 *  Copyright 2015 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.netflix.imflibrary.exceptions;

/**
 * Unchecked exception class that is used when a fatal error occurs in processing of an MXF file
 */
public class MXFException extends RuntimeException
{

    public MXFException()
    {
        super();
    }

    public MXFException(String s)
    {
        super(s);
    }

    public MXFException(Throwable t)
    {
        super(t);
    }

    public MXFException(String s, Throwable t)
    {
        super(s,t);
    }
}
