package com.northwindspringbootapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RolePermissionDTO {
    private String Role;
    private String Permissions;
    private boolean View;
    private boolean Create;
    private boolean Edit;
    private boolean Delete;
}
