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

package org.apache.skywalking.oal.rt.parser;

import java.util.ArrayList;
import java.util.List;

public class PersistenceColumns {
    private List<PersistenceField> stringFields = new ArrayList<>();
    private List<PersistenceField> longFields = new ArrayList<>();
    private List<PersistenceField> doubleFields = new ArrayList<>();
    private List<PersistenceField> intFields = new ArrayList<>();
    private List<PersistenceField> objectFields = new ArrayList<>();

    public void addStringField(String fieldName) {
        stringFields.add(new PersistenceField(fieldName, "String"));
    }

    public void addLongField(String fieldName) {
        longFields.add(new PersistenceField(fieldName, "long"));
    }

    public void addDoubleField(String fieldName) {
        doubleFields.add(new PersistenceField(fieldName, "double"));
    }

    public void addIntField(String fieldName) {
        intFields.add(new PersistenceField(fieldName, "int"));
    }

    public void addObjectField(String fieldName, String fieldType) {
        objectFields.add(new PersistenceField(fieldName, fieldType));
    }

    public List<PersistenceField> getStringFields() {
        return stringFields;
    }

    public List<PersistenceField> getLongFields() {
        return longFields;
    }

    public List<PersistenceField> getDoubleFields() {
        return doubleFields;
    }

    public List<PersistenceField> getIntFields() {
        return intFields;
    }

    public List<PersistenceField> getObjectFields() {
        return objectFields;
    }
}
