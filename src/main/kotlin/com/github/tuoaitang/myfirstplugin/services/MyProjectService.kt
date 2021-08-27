package com.github.tuoaitang.myfirstplugin.services

import com.github.tuoaitang.myfirstplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
