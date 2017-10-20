package com.indrajit.example;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

/**
 * @author indrajit
 */

@EqualsAndHashCode(callSuper = true)
@Data
class ExampleTask extends DefaultTask {
    @Input
    private String projectName;
    private String projectDescription;

    @TaskAction
    void exampleTask() {
        System.out.printf("Project Name: '%s'\n", getProjectName());
        System.out.printf("Project Description: '%s'\n", getProjectDescription());
    }
}
