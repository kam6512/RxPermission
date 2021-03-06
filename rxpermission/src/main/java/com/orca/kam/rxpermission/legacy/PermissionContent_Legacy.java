package com.orca.kam.rxpermission.legacy;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import static com.google.common.base.Strings.isNullOrEmpty;

/**
 * Project RxPermission
 *
 * @author Kang Young Won
 * @create 2017-02-16 - 오후 4:08
 */
public class PermissionContent_Legacy implements Parcelable {
    private List<String> permissions;
    private String packageName;
    private String explanationMessage;
    private String explanationConfirmButtonText;
    private String deniedMessage;
    private String deniedCloseButtonText;
    private String settingButtonText;


    PermissionContent_Legacy() {
    }


    private PermissionContent_Legacy(Parcel source) {
        readFromParcel(source);
    }


    PermissionContent_Legacy(List<String> permissions, String packageName,
                             String explanationMessage, String explanationConfirmButtonText,
                             String deniedMessage, String deniedCloseButtonText,
                             String settingButtonText) {
        this.permissions = permissions;
        this.packageName = packageName;
        this.explanationMessage = explanationMessage;
        this.explanationConfirmButtonText = explanationConfirmButtonText;
        this.deniedMessage = deniedMessage;
        this.deniedCloseButtonText = deniedCloseButtonText;
        this.settingButtonText = settingButtonText;
    }


    public void setPermissions(List<String> permissions) {
        this.permissions = permissions;
    }


    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }


    public void setExplanationMessage(String explanationMessage) {
        this.explanationMessage = explanationMessage;
    }


    public void setExplanationConfirmButtonText(String explanationConfirmButtonText) {
        this.explanationConfirmButtonText = explanationConfirmButtonText;
    }


    public void setDeniedMessage(String deniedMessage) {
        this.deniedMessage = deniedMessage;
    }


    public void setDeniedCloseButtonText(String deniedCloseButtonText) {
        this.deniedCloseButtonText = deniedCloseButtonText;
    }


    public void setSettingButtonText(String settingButtonText) {
        this.settingButtonText = settingButtonText;
    }


    public List<String> getPermissions() {
        return permissions;
    }


    public String getPackageName() {
        return packageName;
    }


    public String getExplanationMessage() {
        return !isNullOrEmpty(explanationMessage) ? explanationMessage :
                "we need permission for read contact and find your location";
    }


    public String getExplanationConfirmButtonText() {
        return !isNullOrEmpty(explanationConfirmButtonText) ?
                explanationConfirmButtonText : "Confirm";
    }


    public String getDeniedMessage() {
        return !isNullOrEmpty(deniedMessage) ? deniedMessage :
                "If you reject permission,you can not use this service\n" +
                        "Please turn on permissions at [Setting] > [Permission]";
    }


    public String getDeniedCloseButtonText() {
        return !isNullOrEmpty(deniedCloseButtonText) ?
                deniedCloseButtonText : "Close";
    }


    public String getSettingButtonText() {
        return !isNullOrEmpty(settingButtonText) ?
                settingButtonText : "Go to Setting";
    }


    @Override public int describeContents() {
        return 0;
    }


    @Override public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringList(permissions);
        dest.writeString(packageName);
        dest.writeString(explanationMessage);
        dest.writeString(explanationConfirmButtonText);
        dest.writeString(deniedMessage);
        dest.writeString(deniedCloseButtonText);
        dest.writeString(settingButtonText);
    }


    private void readFromParcel(Parcel source) {
        this.permissions = source.createStringArrayList();
        this.packageName = source.readString();
        this.explanationMessage = source.readString();
        this.explanationConfirmButtonText = source.readString();
        this.deniedMessage = source.readString();
        this.deniedCloseButtonText = source.readString();
        this.settingButtonText = source.readString();
    }


    public static final Creator<PermissionContent_Legacy> CREATOR
            = new Creator<PermissionContent_Legacy>() {
        @Override public PermissionContent_Legacy createFromParcel(Parcel source) {
            return new PermissionContent_Legacy(source);
        }


        @Override public PermissionContent_Legacy[] newArray(int size) {
            return new PermissionContent_Legacy[size];
        }
    };
}