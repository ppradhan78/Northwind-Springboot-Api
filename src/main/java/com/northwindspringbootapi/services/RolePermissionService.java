package com.northwindspringbootapi.services;

import com.northwindspringbootapi.dto.RolePermissionDTO;
import org.springframework.stereotype.Service;

import java.util.List;
public interface RolePermissionService {
     List<RolePermissionDTO> getAllPermissions();
     List<RolePermissionDTO> getUserPermissionsById(Integer userId);
}
