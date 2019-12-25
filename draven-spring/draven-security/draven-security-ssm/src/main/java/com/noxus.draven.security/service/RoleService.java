package com.noxus.draven.security.service;

import com.noxus.draven.security.pojo.Permission;
import com.noxus.draven.security.pojo.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAll() throws Exception;

    void save(Role role) throws Exception;

    Role findById(String roleId) throws Exception;

    List<Permission> findOtherPermissions(String roleId) throws Exception;

    void addPermissionToRole(String roleId, String[] permissionIds) throws Exception;

    void deleteRoleById(String roleId) throws Exception;
}
