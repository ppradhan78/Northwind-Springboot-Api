package com.northwindspringbootapi.services.impl;

import com.northwindspringbootapi.dto.CategoryDTO;
import com.northwindspringbootapi.dto.RolePermissionDTO;
import com.northwindspringbootapi.repository.RolePermissionRepository;
import com.northwindspringbootapi.services.CategoryService;
import com.northwindspringbootapi.services.RolePermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RolePermissionServiceImpl implements RolePermissionService {
    private final RolePermissionRepository repository;

    public List<RolePermissionDTO> getAllPermissions() {
        return repository.getRolePermissions();
    }

    public List<RolePermissionDTO> getUserPermissionsById(Integer userId) {
        return repository.getUserPermissionsById(userId);
    }
}
