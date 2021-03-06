/*
Copyright (c) Microsoft Open Technologies, Inc.
All Rights Reserved
Apache 2.0 License
 
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
 
     http://www.apache.org/licenses/LICENSE-2.0
 
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 
See the Apache Version 2.0 License for specific language governing permissions and limitations under the License.
 */

/**
 * MobileServiceSyncHandler.java
 */
package com.microsoft.windowsazure.mobileservices.table.sync.synchandler;

import com.google.gson.JsonObject;
import com.microsoft.windowsazure.mobileservices.table.sync.operations.RemoteTableOperationProcessor;
import com.microsoft.windowsazure.mobileservices.table.sync.operations.TableOperation;
import com.microsoft.windowsazure.mobileservices.table.sync.push.MobileServicePushCompletionResult;

/**
 * Handles table operation errors and push completion results.
 */
public interface MobileServiceSyncHandler {

    /**
     * Executes a table operation against a remote store
     *
     * @param processor the remote table processor
     * @param operation the table operation
     * @return the operation result
     * @throws MobileServiceSyncHandlerException
     */
    JsonObject executeTableOperation(RemoteTableOperationProcessor processor, TableOperation operation) throws MobileServiceSyncHandlerException;

    /**
     * Handles push sync completion
     *
     * @param pushCompletionResult the push sync result
     * @throws MobileServiceSyncHandlerException
     */
    void onPushComplete(MobileServicePushCompletionResult pushCompletionResult) throws MobileServiceSyncHandlerException;
}