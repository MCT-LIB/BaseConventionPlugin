package com.mct.convention;

import com.android.build.api.dsl.ApplicationExtension;
import com.android.build.api.dsl.CommonExtension;

import org.gradle.api.JavaVersion;

public class SdkConfiguration {

    private static final int MIN_SDK = 21;
    private static final int TARGET_SDK = 34;
    private static final int COMPILE_SDK = 34;
    private static final JavaVersion JAVA_VERSION = JavaVersion.VERSION_1_8;

    public static void configure(CommonExtension<?, ?, ?, ?, ?> extension) {
        extension.setCompileSdk(COMPILE_SDK);
        extension.getDefaultConfig().setMinSdk(MIN_SDK);
        if (extension instanceof ApplicationExtension) {
            ((ApplicationExtension) extension).getDefaultConfig().setTargetSdk(TARGET_SDK);
        }

        extension.getCompileOptions().setSourceCompatibility(JAVA_VERSION);
        extension.getCompileOptions().setTargetCompatibility(JAVA_VERSION);
    }
}
