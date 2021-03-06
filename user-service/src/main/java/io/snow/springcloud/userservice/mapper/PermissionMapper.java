package io.snow.springcloud.userservice.mapper;

import io.snow.model.vo.Permission;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public interface PermissionMapper {

    List<Permission> getUserNavPermissions(String userName);

    List<Permission> getDefaultPermission();

    List<Long> getUserPermissionsIds(String userName);

    List<Permission> findAllParentMenus();

    List<Permission> getUserPermissionWithApi(String userName);

    int insertPermission(Permission permission);

    /**
     * Permission 权限分页查找
     * @return
     */
    List<Permission> findSubMenusByParentIdPage(Map<String,Object> map);

    /**
     * 权限详情，修改时调用
     * @param id
     * @return
     */
    Permission findPermissionById(Long id);

    Permission findPermissionByUrl(String url);

    int deletePermission(List<Long> deleteIds);

//    void insertPermissionAndApi(Map<String, Object> permissionAndApi);

    /**
     * 删除permission 关联的api
     * @param id
     */
    void deletePermissionApi(Long id);

    int updatePermission(Permission permission);

    void insertPermissionApi(Map<String, Object> map);

    int deletePermissionNotReal(List<Long> deleteIds);
}
