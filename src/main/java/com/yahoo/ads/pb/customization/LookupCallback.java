/*
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or
 * agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and
 * limitations under the License. See accompanying LICENSE file.
 */

package com.yahoo.ads.pb.customization;

/**
 * Callback/Hook registered upon lookup called on server side.
 */
public interface LookupCallback {

    /**
     * Given the key and currentValue of lookup, return the massaged value
     * 
     * @param key
     * @param currentValue
     * @return
     */
    public byte[] onLookup(byte[] key, byte[] currentValue);
}
