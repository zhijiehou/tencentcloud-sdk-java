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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HandleStreamConnectProjectRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 云转推项目Id 。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 请参考 [操作类型](#Operation)
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 转推输入源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
    */
    @SerializedName("InputInfo")
    @Expose
    private StreamInputInfo InputInfo;

    /**
    * 主备输入源标识，取值有：
<li> Main ：主源；</li>
<li> Backup ：备源。</li>
    */
    @SerializedName("InputEndpoint")
    @Expose
    private String InputEndpoint;

    /**
    * 转推输出源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
    */
    @SerializedName("OutputInfo")
    @Expose
    private StreamConnectOutput OutputInfo;

    /**
    * 云转推当前预计结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。具体操作方式详见 [操作类型](#Operation) 及下文示例。
    */
    @SerializedName("CurrentStopTime")
    @Expose
    private String CurrentStopTime;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 云转推项目Id 。 
     * @return ProjectId 云转推项目Id 。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 云转推项目Id 。
     * @param ProjectId 云转推项目Id 。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 请参考 [操作类型](#Operation) 
     * @return Operation 请参考 [操作类型](#Operation)
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 请参考 [操作类型](#Operation)
     * @param Operation 请参考 [操作类型](#Operation)
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 转推输入源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。 
     * @return InputInfo 转推输入源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
     */
    public StreamInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * Set 转推输入源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
     * @param InputInfo 转推输入源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
     */
    public void setInputInfo(StreamInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * Get 主备输入源标识，取值有：
<li> Main ：主源；</li>
<li> Backup ：备源。</li> 
     * @return InputEndpoint 主备输入源标识，取值有：
<li> Main ：主源；</li>
<li> Backup ：备源。</li>
     */
    public String getInputEndpoint() {
        return this.InputEndpoint;
    }

    /**
     * Set 主备输入源标识，取值有：
<li> Main ：主源；</li>
<li> Backup ：备源。</li>
     * @param InputEndpoint 主备输入源标识，取值有：
<li> Main ：主源；</li>
<li> Backup ：备源。</li>
     */
    public void setInputEndpoint(String InputEndpoint) {
        this.InputEndpoint = InputEndpoint;
    }

    /**
     * Get 转推输出源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。 
     * @return OutputInfo 转推输出源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
     */
    public StreamConnectOutput getOutputInfo() {
        return this.OutputInfo;
    }

    /**
     * Set 转推输出源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
     * @param OutputInfo 转推输出源操作参数。具体操作方式详见 [操作类型](#Operation) 及下文示例。
     */
    public void setOutputInfo(StreamConnectOutput OutputInfo) {
        this.OutputInfo = OutputInfo;
    }

    /**
     * Get 云转推当前预计结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。具体操作方式详见 [操作类型](#Operation) 及下文示例。 
     * @return CurrentStopTime 云转推当前预计结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。具体操作方式详见 [操作类型](#Operation) 及下文示例。
     */
    public String getCurrentStopTime() {
        return this.CurrentStopTime;
    }

    /**
     * Set 云转推当前预计结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。具体操作方式详见 [操作类型](#Operation) 及下文示例。
     * @param CurrentStopTime 云转推当前预计结束时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#I)。具体操作方式详见 [操作类型](#Operation) 及下文示例。
     */
    public void setCurrentStopTime(String CurrentStopTime) {
        this.CurrentStopTime = CurrentStopTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamSimple(map, prefix + "InputEndpoint", this.InputEndpoint);
        this.setParamObj(map, prefix + "OutputInfo.", this.OutputInfo);
        this.setParamSimple(map, prefix + "CurrentStopTime", this.CurrentStopTime);

    }
}

