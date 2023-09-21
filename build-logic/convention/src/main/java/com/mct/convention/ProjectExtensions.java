package com.mct.convention;

import org.gradle.api.Project;
import org.gradle.api.artifacts.VersionCatalog;
import org.gradle.api.artifacts.VersionCatalogsExtension;

public class ProjectExtensions {

    public static VersionCatalog get(Project project) {
        return project.getExtensions().getByType(VersionCatalogsExtension.class).named("libs");
    }
}
