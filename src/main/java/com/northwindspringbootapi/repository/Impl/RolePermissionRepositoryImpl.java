package com.northwindspringbootapi.repository.Impl;

import com.northwindspringbootapi.dto.RolePermissionDTO;
import com.northwindspringbootapi.repository.CategoryRepository;
import com.northwindspringbootapi.repository.RolePermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@RequiredArgsConstructor

public class RolePermissionRepositoryImpl  implements RolePermissionRepository {

    private final JdbcTemplate jdbcTemplate;

    public List<RolePermissionDTO> getRolePermissions() {
        return jdbcTemplate.query("EXEC GetRolePermissionsAction", new RowMapper<RolePermissionDTO>() {
            @Override
            public RolePermissionDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                RolePermissionDTO dto = new RolePermissionDTO();
                dto.setRole(rs.getString("Role"));
                dto.setPermissions(rs.getString("Permissions"));
                dto.setCanView(rs.getBoolean("View"));
                dto.setCanCreate(rs.getBoolean("Create"));
                dto.setCanEdit(rs.getBoolean("Edit"));
                dto.setCanDelete(rs.getBoolean("Delete"));
                return dto;
            }
        });
    }
}
