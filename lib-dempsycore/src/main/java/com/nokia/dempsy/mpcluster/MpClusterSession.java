/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nokia.dempsy.mpcluster;

import com.nokia.dempsy.config.ClusterId;

/**
 * <p>An {@link MpClusterSession} represents a session with the cluster
 * manager. In the case of a ZooKeeper implementation this represents
 * a ZooKeeper instance.</p>
 */
public interface MpClusterSession<T, N>
{
   public MpCluster<T, N> getCluster(ClusterId mpClusterId) throws MpClusterException;
   
   /**
    * stop() must be implemented such that it doesn't throw an exception no matter what
    * but forces the stopping of any underlying resources that require stopping. Stop
    * is expected to manage the stopping of all underlying MpClusters that it created
    * and once complete no more MpWatcher callbacks should be, or be able to, execute.
    * 
    * NOTE: stop() must be idempotent.
    */
   public void stop();
   
}
