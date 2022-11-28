/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.core.analysis.manual.relation.instance;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.skywalking.oap.server.core.Const;
import org.apache.skywalking.oap.server.core.analysis.Stream;
import org.apache.skywalking.oap.server.core.analysis.metrics.Metrics;
import org.apache.skywalking.oap.server.core.analysis.worker.MetricsStreamProcessor;
import org.apache.skywalking.oap.server.core.remote.grpc.proto.RemoteData;
import org.apache.skywalking.oap.server.core.source.DefaultScopeDefine;
import org.apache.skywalking.oap.server.core.storage.annotation.BanyanDB;
import org.apache.skywalking.oap.server.core.storage.annotation.Column;
import org.apache.skywalking.oap.server.core.storage.type.Convert2Entity;
import org.apache.skywalking.oap.server.core.storage.type.Convert2Storage;
import org.apache.skywalking.oap.server.core.storage.type.StorageBuilder;

@Stream(name = ServiceInstanceRelationServerSideMetrics.INDEX_NAME, scopeId = DefaultScopeDefine.SERVICE_INSTANCE_RELATION,
    builder = ServiceInstanceRelationServerSideMetrics.Builder.class, processor = MetricsStreamProcessor.class)
@EqualsAndHashCode(of = {
    "entityId"
}, callSuper = true)
public class ServiceInstanceRelationServerSideMetrics extends Metrics {

    public static final String INDEX_NAME = "service_instance_relation_server_side";
    public static final String SOURCE_SERVICE_ID = "source_service_id";
    public static final String SOURCE_SERVICE_INSTANCE_ID = "source_service_instance_id";
    public static final String DEST_SERVICE_ID = "dest_service_id";
    public static final String DEST_SERVICE_INSTANCE_ID = "dest_service_instance_id";
    public static final String COMPONENT_ID = "component_id";

    @Setter
    @Getter
    @Column(columnName = SOURCE_SERVICE_ID)
    private String sourceServiceId;
    @Setter
    @Getter
    @Column(columnName = SOURCE_SERVICE_INSTANCE_ID)
    private String sourceServiceInstanceId;
    @Setter
    @Getter
    @Column(columnName = DEST_SERVICE_ID)
    private String destServiceId;
    @Setter
    @Getter
    @Column(columnName = DEST_SERVICE_INSTANCE_ID)
    private String destServiceInstanceId;
    @Setter
    @Getter
    @Column(columnName = COMPONENT_ID, storageOnly = true)
    private int componentId;
    @Setter
    @Getter
    @Column(columnName = ENTITY_ID, length = 512)
    @BanyanDB.ShardingKey(index = 0)
    private String entityId;

    @Override
    protected String id0() {
        return getTimeBucket() + Const.ID_CONNECTOR + entityId;
    }

    @Override
    public boolean combine(Metrics metrics) {
        return true;
    }

    @Override
    public void calculate() {

    }

    @Override
    public Metrics toHour() {
        ServiceInstanceRelationServerSideMetrics metrics = new ServiceInstanceRelationServerSideMetrics();
        metrics.setTimeBucket(toTimeBucketInHour());
        metrics.setSourceServiceId(getSourceServiceId());
        metrics.setSourceServiceInstanceId(getSourceServiceInstanceId());
        metrics.setDestServiceId(getDestServiceId());
        metrics.setDestServiceInstanceId(getDestServiceInstanceId());
        metrics.setComponentId(getComponentId());
        metrics.setEntityId(getEntityId());
        return metrics;
    }

    @Override
    public Metrics toDay() {
        ServiceInstanceRelationServerSideMetrics metrics = new ServiceInstanceRelationServerSideMetrics();
        metrics.setTimeBucket(toTimeBucketInDay());
        metrics.setSourceServiceId(getSourceServiceId());
        metrics.setSourceServiceInstanceId(getSourceServiceInstanceId());
        metrics.setDestServiceId(getDestServiceId());
        metrics.setDestServiceInstanceId(getDestServiceInstanceId());
        metrics.setComponentId(getComponentId());
        metrics.setEntityId(getEntityId());
        return metrics;
    }

    @Override
    public int remoteHashCode() {
        int n = 17;
        n = 31 * n + this.entityId.hashCode();
        return n;
    }

    @Override
    public void deserialize(RemoteData remoteData) {
        setEntityId(remoteData.getDataStrings(0));
        setSourceServiceId(remoteData.getDataStrings(1));
        setSourceServiceInstanceId(remoteData.getDataStrings(2));
        setDestServiceId(remoteData.getDataStrings(3));
        setDestServiceInstanceId(remoteData.getDataStrings(4));

        setComponentId(remoteData.getDataIntegers(0));

        setTimeBucket(remoteData.getDataLongs(0));
    }

    @Override
    public RemoteData.Builder serialize() {
        RemoteData.Builder remoteBuilder = RemoteData.newBuilder();

        remoteBuilder.addDataStrings(getEntityId());
        remoteBuilder.addDataStrings(getSourceServiceId());
        remoteBuilder.addDataStrings(getSourceServiceInstanceId());
        remoteBuilder.addDataStrings(getDestServiceId());
        remoteBuilder.addDataStrings(getDestServiceInstanceId());

        remoteBuilder.addDataIntegers(getComponentId());

        remoteBuilder.addDataLongs(getTimeBucket());
        return remoteBuilder;
    }

    public static class Builder implements StorageBuilder<ServiceInstanceRelationServerSideMetrics> {
        @Override
        public ServiceInstanceRelationServerSideMetrics storage2Entity(final Convert2Entity converter) {
            ServiceInstanceRelationServerSideMetrics metrics = new ServiceInstanceRelationServerSideMetrics();
            metrics.setEntityId((String) converter.get(ENTITY_ID));
            metrics.setSourceServiceId((String) converter.get(SOURCE_SERVICE_ID));
            metrics.setSourceServiceInstanceId((String) converter.get(SOURCE_SERVICE_INSTANCE_ID));
            metrics.setDestServiceId((String) converter.get(DEST_SERVICE_ID));
            metrics.setDestServiceInstanceId((String) converter.get(DEST_SERVICE_INSTANCE_ID));
            metrics.setComponentId(((Number) converter.get(COMPONENT_ID)).intValue());
            metrics.setTimeBucket(((Number) converter.get(TIME_BUCKET)).longValue());
            return metrics;
        }

        @Override
        public void entity2Storage(final ServiceInstanceRelationServerSideMetrics storageData,
                                   final Convert2Storage converter) {
            converter.accept(ENTITY_ID, storageData.getEntityId());
            converter.accept(SOURCE_SERVICE_ID, storageData.getSourceServiceId());
            converter.accept(SOURCE_SERVICE_INSTANCE_ID, storageData.getSourceServiceInstanceId());
            converter.accept(DEST_SERVICE_ID, storageData.getDestServiceId());
            converter.accept(DEST_SERVICE_INSTANCE_ID, storageData.getDestServiceInstanceId());
            converter.accept(COMPONENT_ID, storageData.getComponentId());
            converter.accept(TIME_BUCKET, storageData.getTimeBucket());
        }
    }
}