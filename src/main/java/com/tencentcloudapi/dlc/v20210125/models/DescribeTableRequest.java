/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableRequest extends AbstractModel{

    /**
    * 查询对象表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 查询表所在的数据库名称。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
     * Get 查询对象表名称 
     * @return TableName 查询对象表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 查询对象表名称
     * @param TableName 查询对象表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 查询表所在的数据库名称。 
     * @return DatabaseName 查询表所在的数据库名称。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 查询表所在的数据库名称。
     * @param DatabaseName 查询表所在的数据库名称。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);

    }
}
