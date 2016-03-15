/**
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.apache.kerby.kerberos.kerb.admin.kadmin.remote.request;

import org.apache.kerby.KOption;
import org.apache.kerby.KOptions;
import org.apache.kerby.kerberos.kerb.admin.kadmin.remote.AdminContext;
import org.apache.kerby.kerberos.kerb.admin.tool.AdReq;

import java.nio.ByteBuffer;

/**
 * AddPrincipal request
 */
public class AdRequest extends AdminRequest {

    private KOptions kOptions;
    private String password;

    public AdRequest(String principal) {
        super(principal);
    }

    public AdRequest(String principal, KOptions kOptions) {
        super(principal);
        this.kOptions = kOptions;
    }

    public AdRequest(String princial, KOptions kOptions, String password) {
        super(princial);
        this.kOptions = kOptions;
        this.password = password;
    }

    @Override
    public void process() {
        super.process();
        /**replace this with encode in handler*/
        AdReq adReq = new AdReq(ByteBuffer.wrap(super.getPrincipal().getBytes()));
        setAdminReq(adReq);

    }

}
