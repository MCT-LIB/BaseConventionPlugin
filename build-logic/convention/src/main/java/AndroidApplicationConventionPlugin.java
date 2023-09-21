import com.android.build.api.dsl.ApplicationExtension;
import com.mct.convention.SdkConfiguration;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class AndroidApplicationConventionPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        target.getPluginManager().apply("com.android.application");
        target.getExtensions().configure(ApplicationExtension.class, SdkConfiguration::configure);
    }
}
