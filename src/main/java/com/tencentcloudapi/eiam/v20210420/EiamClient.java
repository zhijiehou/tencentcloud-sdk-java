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
package com.tencentcloudapi.eiam.v20210420;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.eiam.v20210420.models.*;

public class EiamClient extends AbstractClient{
    private static String endpoint = "eiam.tencentcloudapi.com";
    private static String service = "eiam";
    private static String version = "2021-04-20";

    public EiamClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public EiamClient(Credential credential, String region, ClientProfile profile) {
        super(EiamClient.endpoint, EiamClient.version, credential, region, profile);
    }

    /**
     *加入用户到用户组
     * @param req AddUserToUserGroupRequest
     * @return AddUserToUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddUserToUserGroupResponse AddUserToUserGroup(AddUserToUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddUserToUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<AddUserToUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddUserToUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建一个机构节点
     * @param req CreateOrgNodeRequest
     * @return CreateOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public CreateOrgNodeResponse CreateOrgNode(CreateOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建一个用户
     * @param req CreateUserRequest
     * @return CreateUserResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserResponse CreateUser(CreateUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建用户组
     * @param req CreateUserGroupRequest
     * @return CreateUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateUserGroupResponse CreateUserGroup(CreateUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取JWT公钥信息
     * @param req DecribePublicKeyRequest
     * @return DecribePublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public DecribePublicKeyResponse DecribePublicKey(DecribePublicKeyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DecribePublicKeyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DecribePublicKeyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DecribePublicKey");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个机构节点
     * @param req DeleteOrgNodeRequest
     * @return DeleteOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteOrgNodeResponse DeleteOrgNode(DeleteOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户名或用户 id 删除用户。
     * @param req DeleteUserRequest
     * @return DeleteUserResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserResponse DeleteUser(DeleteUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个用户组
     * @param req DeleteUserGroupRequest
     * @return DeleteUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteUserGroupResponse DeleteUserGroup(DeleteUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取一个应用的信息。
     * @param req DescribeApplicationRequest
     * @return DescribeApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DescribeApplicationResponse DescribeApplication(DescribeApplicationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeApplicationResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeApplicationResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeApplication");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据机构节点ID读取机构节点信息
     * @param req DescribeOrgNodeRequest
     * @return DescribeOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public DescribeOrgNodeResponse DescribeOrgNode(DescribeOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户组信息
     * @param req DescribeUserGroupRequest
     * @return DescribeUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserGroupResponse DescribeUserGroup(DescribeUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户名或用户 id 搜索用户
     * @param req DescribeUserInfoRequest
     * @return DescribeUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserInfoResponse DescribeUserInfo(DescribeUserInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过机构节点ID获得被授权访问的应用列表。
     * @param req ListAuthorizedApplicationsToOrgNodeRequest
     * @return ListAuthorizedApplicationsToOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public ListAuthorizedApplicationsToOrgNodeResponse ListAuthorizedApplicationsToOrgNode(ListAuthorizedApplicationsToOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuthorizedApplicationsToOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAuthorizedApplicationsToOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAuthorizedApplicationsToOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户ID获得被授权访问的应用列表。
     * @param req ListAuthorizedApplicationsToUserRequest
     * @return ListAuthorizedApplicationsToUserResponse
     * @throws TencentCloudSDKException
     */
    public ListAuthorizedApplicationsToUserResponse ListAuthorizedApplicationsToUser(ListAuthorizedApplicationsToUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuthorizedApplicationsToUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAuthorizedApplicationsToUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAuthorizedApplicationsToUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户组ID获得被授权访问的应用列表。
     * @param req ListAuthorizedApplicationsToUserGroupRequest
     * @return ListAuthorizedApplicationsToUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListAuthorizedApplicationsToUserGroupResponse ListAuthorizedApplicationsToUserGroup(ListAuthorizedApplicationsToUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListAuthorizedApplicationsToUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListAuthorizedApplicationsToUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListAuthorizedApplicationsToUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户所在的用户组列表
     * @param req ListUserGroupsOfUserRequest
     * @return ListUserGroupsOfUserResponse
     * @throws TencentCloudSDKException
     */
    public ListUserGroupsOfUserResponse ListUserGroupsOfUser(ListUserGroupsOfUserRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUserGroupsOfUserResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUserGroupsOfUserResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUserGroupsOfUser");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据机构节点ID读取节点下用户
     * @param req ListUsersInOrgNodeRequest
     * @return ListUsersInOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersInOrgNodeResponse ListUsersInOrgNode(ListUsersInOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersInOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersInOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUsersInOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户组中的用户列表
     * @param req ListUsersInUserGroupRequest
     * @return ListUsersInUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public ListUsersInUserGroupResponse ListUsersInUserGroup(ListUsersInUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListUsersInUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListUsersInUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListUsersInUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过用户名或用户 id 冻结用户
     * @param req ModifyUserInfoRequest
     * @return ModifyUserInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserInfoResponse ModifyUserInfo(ModifyUserInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserInfoResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从用户组中移除用户
     * @param req RemoveUserFromUserGroupRequest
     * @return RemoveUserFromUserGroupResponse
     * @throws TencentCloudSDKException
     */
    public RemoveUserFromUserGroupResponse RemoveUserFromUserGroup(RemoveUserFromUserGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveUserFromUserGroupResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<RemoveUserFromUserGroupResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RemoveUserFromUserGroup");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新建一个机构节点，
     * @param req UpdateOrgNodeRequest
     * @return UpdateOrgNodeResponse
     * @throws TencentCloudSDKException
     */
    public UpdateOrgNodeResponse UpdateOrgNode(UpdateOrgNodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateOrgNodeResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateOrgNodeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateOrgNode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
