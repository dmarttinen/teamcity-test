package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'IntegrationBuild'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("IntegrationBuild")) {
    requirements {
        remove {
            matches("teamcity.agent.jvm.os.family", "Windows")
        }
        add {
            matches("teamcity.agent.jvm.os.family", "Windows", "RQ_1")
        }
    }

    expectDisabledSettings()
    updateDisabledSettings("RQ_1")
}
