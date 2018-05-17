package com.tencentcloudapi.vpc.v20170312.models;
import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
public class CreateSecurityGroupResponse  extends AbstractModel{


    /**
    * 安全组对象。
    */
    @SerializedName("SecurityGroup")
    @Expose
    private SecurityGroup SecurityGroup;
    

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    

    /**
     * 获取安全组对象。
     * @return SecurityGroup 安全组对象。
     */
    public SecurityGroup getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * 设置安全组对象。
     * @param SecurityGroup 安全组对象。
     */
    public void setSecurityGroup(SecurityGroup SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
