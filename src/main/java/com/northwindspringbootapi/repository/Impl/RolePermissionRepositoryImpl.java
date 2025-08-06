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
                dto.setView(rs.getBoolean("View"));
                dto.setCreate(rs.getBoolean("Create"));
                dto.setEdit(rs.getBoolean("Edit"));
                dto.setDelete(rs.getBoolean("Delete"));
//                int viewValue = rs.getInt("View");
//                dto.setView(viewValue == 1);
//                int createValue = rs.getInt("Create");
//                dto.setCreate(createValue == 1);
//                int editValue = rs.getInt("Edit");
//                dto.setEdit(editValue == 1);
//                int deleteValue = rs.getInt("Delete");
//                dto.setDelete(deleteValue == 1);
//                String viewString = rs.getString("View");
//                dto.setView(Boolean.parseBoolean(viewString));
//
//                String createString = rs.getString("Create");
//                dto.setCreate(Boolean.parseBoolean(createString));
//                String editString = rs.getString("Edit");
//                dto.setEdit(Boolean.parseBoolean(editString));
//                String deleteString = rs.getString("Delete");
//                dto.setDelete(Boolean.parseBoolean(deleteString));
                return dto;
            }
        });
    }
}
