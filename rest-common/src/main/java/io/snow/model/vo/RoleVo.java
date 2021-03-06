package io.snow.model.vo;


import java.io.Serializable;
import java.util.List;

public class RoleVo extends BaseVo implements Serializable {

    private Long id;

    private String code;

    private String name;

    private List<Permission> rolePermissions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Permission> getRolePermissions() {
        return rolePermissions;
    }

    public void setRolePermissions(List<Permission> rolePermissions) {
        this.rolePermissions = rolePermissions;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
