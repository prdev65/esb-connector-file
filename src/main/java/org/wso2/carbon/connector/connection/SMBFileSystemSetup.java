/*
 * Copyright (c) 2024, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.connector.connection;

import org.apache.commons.vfs2.FileSystemOptions;
import org.wso2.carbon.connector.pojo.ConnectionConfiguration;
import org.wso2.carbon.connector.utils.Const;

/**
 * Sets up local file system.
 */
public class SMBFileSystemSetup implements ProtocolBasedFileSystemSetup {

    @Override
    public String setupFileSystemHandler(FileSystemOptions fso, ConnectionConfiguration fsConfig) {

        return Const.SMB_PROTOCOL_PREFIX + constructVfsUrl(fsConfig);

    }
}
