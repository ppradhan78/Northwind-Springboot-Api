package com.northwindspringbootapi.controllers.v1;

import com.northwindspringbootapi.dto.CategoryDTO;
import com.northwindspringbootapi.dto.RolePermissionDTO;
import com.northwindspringbootapi.services.RolePermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/role-permissions")
@RestController
@RequiredArgsConstructor
public class RolePermissionController {

@Autowired
    private final RolePermissionService service;

    @GetMapping
    public List<RolePermissionDTO> getRolePermissions() {
        return service.getAllPermissions();
    }
    @GetMapping("/{userId}")
    public List<RolePermissionDTO> getUserPermissionsById(@PathVariable Integer userId) {
        return  service.getUserPermissionsById(userId);
    }
}
