<div align="center">

<img align="center" width="300" src="/art/title.png" alt="RxAndroid">

<br>
</div>

<p align="center" color="#4169e1">
RxPermission is a library that makes it easy to request Android permissions
<br>
from Android 6.0 (Marshmallow, API 23) or higher
</p>

<div align="center">

[![forthebadge](http://forthebadge.com/images/badges/built-with-love.svg)](http://forthebadge.com)[![forthebadge](http://forthebadge.com/images/badges/built-for-android.svg)](http://forthebadge.com)[![forthebadge](http://forthebadge.com/images/badges/makes-people-smile.svg)](http://forthebadge.com)

</div>

## Overview

## Getting Started

```java
dependencies {
    compile 'com.github.kam6512:RxPermission:1.1'
}
```

```java
private CompositeDisposable disposables = new CompositeDisposable();

PermissionX permissionX = new PermissionX(this);
Disposable disposable = permissionX
	.request(READ_CALENDAR, WRITE_CALENDAR,
		READ_EXTERNAL_STORAGE, WRITE_EXTERNAL_STORAGE,
		CAMERA, INTERNET)
	.requestPermission()
	.subscribe(permissionPair -> Log.i(TAG, permissionPair.permissionName + " is " + permissionPair.isGranted),
		throwable -> Log.i("ERROR", throwable.getMessage(),
		() -> Log.i(TAG, "Permissions Already All Granted"));

disposables.add(disposable);
```


#### Requesting Permissions in Other Ways
```java
permissionX
	.request(READ_CALENDAR)
    .request(WRITE_CALENDAR)
	.request(READ_EXTERNAL_STORAGE)
    .request(WRITE_EXTERNAL_STORAGE)
	.request(CAMERA)
    .request(INTERNET)
	.requestPermission()
	.subscribe(permissionPair -> Log.i(TAG, permissionPair.permissionName + " is " + permissionPair.isGranted),
		throwable -> Log.i("ERROR", throwable.getMessage(),
		() -> Log.i(TAG, "Permissions Already All Granted"));

```
or view [SAMPLE CODE](https://github.com/kam6512/RxPermission/tree/master/sample/src/main/java/com/orca/kam/sample) with [GIF](https://github.com/kam6512/RxPermission/tree/master/art)

###### Developed by [kam6512](https://kam6512.github.io/)
