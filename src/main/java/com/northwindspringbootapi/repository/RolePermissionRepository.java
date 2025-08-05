package com.northwindspringbootapi.repository;

import com.northwindspringbootapi.dto.RolePermissionDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RolePermissionRepository {
    List<RolePermissionDTO> getRolePermissions();

}
