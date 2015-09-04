/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.andes.subscription;

import org.wso2.andes.kernel.AndesContent;
import org.wso2.andes.kernel.AndesException;
import org.wso2.andes.kernel.DeliverableAndesMetadata;

import java.util.UUID;

/**
 * Contract defining subscription related to outbound operations.
 */
public interface OutboundSubscription {

    /**
     * Deliver the message and content to the subscriber
     * @param messageMetadata metadata of the message
     * @param content content of the message
     * @return delivery is success. If delivery rule evaluations are failed delivery will not be a success
     * @throws org.wso2.andes.kernel.AndesException
     */
    public boolean sendMessageToSubscriber(DeliverableAndesMetadata messageMetadata, AndesContent content)throws
            AndesException;

    /**
     * Check if subscription is active. If the underlying channel can accept
     * messages it is considered as live
     * @return true if subscriber is active
     */
    public boolean isActive();

    /**
     * Get ID of the subscription channel
     * @return unique id
     */
    public UUID getChannelID();

}
