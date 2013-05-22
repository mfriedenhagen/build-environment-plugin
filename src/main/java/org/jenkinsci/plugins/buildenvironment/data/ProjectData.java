package org.jenkinsci.plugins.buildenvironment.data;

import java.util.TreeMap;

import org.jenkinsci.plugins.buildenvironment.actions.utils.Constants;

import hudson.model.JobPropertyDescriptor;
import hudson.model.AbstractBuild;
import hudson.model.AbstractProject;

public class ProjectData extends Data {

    public ProjectData(AbstractProject<?, ?> project, AbstractBuild<?, ?> build) {
        super(project, build);
    }

    @Override
    protected String getFileName() {
        return "project.xml";
    }

    protected TreeMap<String, String> createDataMap() {
        TreeMap<String, String> data = new TreeMap<String, String>();
        // get data, add it to map and return the newly created map.
        data.put("Project name", this.getProject().getName());
        data.put("Project url", this.getProject().getUrl());
        data.put("SCM", this.getProject().getScm().toString());
        data.put("SCM type", this.getProject().getScm().getType());
        //data.put("SCM as string", this.getProject().getScm().toString());
       // data.put("SCM browser", this.getProject().getScm().getBrowser().toString());
        return data;
    }

}