import com.android.build.api.dsl.LibraryExtension;
import com.mct.convention.SdkConfiguration;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class AndroidLibraryConventionPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        target.getPluginManager().apply("com.android.library");
        target.getExtensions().configure(LibraryExtension.class, SdkConfiguration::configure);
    }
}
