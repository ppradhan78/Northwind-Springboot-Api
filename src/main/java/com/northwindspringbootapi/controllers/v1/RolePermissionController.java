package com.northwindspringbootapi.controllers.v1;

import com.northwindspringbootapi.dto.RolePermissionDTO;
import com.northwindspringbootapi.services.RolePermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RolePermissionController {

@Autowired
    private final RolePermissionService service;

    @GetMapping("/api/role-permissions")
    public List<RolePermissionDTO> getRolePermissions() {
        return service.getAllPermissions();
    }
}
