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
    private boolean CanView;
    private boolean CanCreate;
    private boolean CanEdit;
    private boolean CanDelete;
}
