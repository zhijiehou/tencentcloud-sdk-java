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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageAttributeRequest extends AbstractModel{

    /**
    * 镜像ID，形如img-gvbnzy6f
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 设置新的镜像名称；必须满足下列限制：
不得超过20个字符。
- 镜像名称不能与已有镜像重复。
    */
    @SerializedName("ImageName")
    @Expose
    private String ImageName;

    /**
    * 设置新的镜像描述；必须满足下列限制：
- 不得超过60个字符。
    */
    @SerializedName("ImageDescription")
    @Expose
    private String ImageDescription;

    /**
     * Get 镜像ID，形如img-gvbnzy6f 
     * @return ImageId 镜像ID，形如img-gvbnzy6f
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * Set 镜像ID，形如img-gvbnzy6f
     * @param ImageId 镜像ID，形如img-gvbnzy6f
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * Get 设置新的镜像名称；必须满足下列限制：
不得超过20个字符。
- 镜像名称不能与已有镜像重复。 
     * @return ImageName 设置新的镜像名称；必须满足下列限制：
不得超过20个字符。
- 镜像名称不能与已有镜像重复。
     */
    public String getImageName() {
        return this.ImageName;
    }

    /**
     * Set 设置新的镜像名称；必须满足下列限制：
不得超过20个字符。
- 镜像名称不能与已有镜像重复。
     * @param ImageName 设置新的镜像名称；必须满足下列限制：
不得超过20个字符。
- 镜像名称不能与已有镜像重复。
     */
    public void setImageName(String ImageName) {
        this.ImageName = ImageName;
    }

    /**
     * Get 设置新的镜像描述；必须满足下列限制：
- 不得超过60个字符。 
     * @return ImageDescription 设置新的镜像描述；必须满足下列限制：
- 不得超过60个字符。
     */
    public String getImageDescription() {
        return this.ImageDescription;
    }

    /**
     * Set 设置新的镜像描述；必须满足下列限制：
- 不得超过60个字符。
     * @param ImageDescription 设置新的镜像描述；必须满足下列限制：
- 不得超过60个字符。
     */
    public void setImageDescription(String ImageDescription) {
        this.ImageDescription = ImageDescription;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "ImageName", this.ImageName);
        this.setParamSimple(map, prefix + "ImageDescription", this.ImageDescription);

    }
}
