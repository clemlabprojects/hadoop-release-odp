/**
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

package org.apache.hadoop.yarn.server.resourcemanager.scheduler.capacity;

/**
 * ODP: the two QueuePath-based prefix helpers the ResourceManager web-service tests ported from
 * Apache Hadoop trunk use; they delegate to the String helpers of CapacitySchedulerConfiguration.
 */
public final class QueuePrefixes {

  private QueuePrefixes() {
  }

  public static String getQueuePrefix(QueuePath queuePath) {
    return CapacitySchedulerConfiguration.getQueuePrefix(queuePath.getFullPath());
  }

  public static String getNodeLabelPrefix(QueuePath queuePath, String label) {
    return CapacitySchedulerConfiguration.getNodeLabelPrefix(queuePath.getFullPath(), label);
  }
}
