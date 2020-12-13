package com.canhub.cropper.common

import android.os.Build
import android.os.Build.VERSION.SDK_INT

class CommonVersionCheck {

    fun isAtLeastQ29() = SDK_INT >= Build.VERSION_CODES.Q
}