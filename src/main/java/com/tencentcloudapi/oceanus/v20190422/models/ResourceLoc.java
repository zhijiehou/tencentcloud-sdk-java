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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceLoc extends AbstractModel{

    /**
    * 资源位置的存储类型，目前只支持COS
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * 描述资源位置的json
    */
    @SerializedName("Param")
    @Expose
    private ResourceLocParam Param;

    /**
     * Get 资源位置的存储类型，目前只支持COS 
     * @return StorageType 资源位置的存储类型，目前只支持COS
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 资源位置的存储类型，目前只支持COS
     * @param StorageType 资源位置的存储类型，目前只支持COS
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 描述资源位置的json 
     * @return Param 描述资源位置的json
     */
    public ResourceLocParam getParam() {
        return this.Param;
    }

    /**
     * Set 描述资源位置的json
     * @param Param 描述资源位置的json
     */
    public void setParam(ResourceLocParam Param) {
        this.Param = Param;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamObj(map, prefix + "Param.", this.Param);

    }
}

