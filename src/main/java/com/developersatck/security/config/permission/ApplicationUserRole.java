package com.developersatck.security.config.permission;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.developersatck.security.config.permission.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    USER(Sets.newHashSet(ORDER_WRITE,PRODUCT_READ,CUSTOMER_WRITE,CUSTOMER_READ)),
    ADMIN(Sets.newHashSet(ORDER_READ,ORDER_WRITE,PRODUCT_READ,PRODUCT_WRITE,CUSTOMER_READ,CUSTOMER_WRITE)),
    MANAGER(Sets.newHashSet(ORDER_READ,PRODUCT_READ,CUSTOMER_READ));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
