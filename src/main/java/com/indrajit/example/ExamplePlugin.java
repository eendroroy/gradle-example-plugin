package com.indrajit.example;

import org.gradle.api.NonNullApi;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * @author indrajit
 */

@NonNullApi
public class ExamplePlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        project.getTasks().create("exampleTask", ExampleTask.class, task -> {
            String projectName = project.getName();
            String projectDescription = project.getDescription();

            task.setProjectName(projectName);
            task.setProjectDescription(projectDescription == null ? "..." : projectDescription);
        });
    }
}
