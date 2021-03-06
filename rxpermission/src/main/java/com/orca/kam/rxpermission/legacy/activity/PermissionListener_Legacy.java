package com.orca.kam.rxpermission.legacy.activity;

import java.util.List;

/**
 * Project RxPermission
 *
 * @author Kang Young Won
 * @create 2016-08-29 - 오전 11:17
 */
public interface PermissionListener_Legacy {

    /**
     * Call From Permission Activity...
     * When All Permissions Granted
     */
    void permissionGranted();

    /**
     * Call From Permission Activity....
     * When Permissions Denied
     *
     * @param deniedPermissions The Denied Permissions from PermissionActivity_Legacy
     */
    void permissionDenied(List<String> deniedPermissions);
}