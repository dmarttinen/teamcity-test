package patches.projects

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the root project
accordingly, and delete the patch script.
*/
changeProject(DslContext.projectId) {
    params {
        expect {
            param("AzAppId", "767d5e60-4d25-4794-9a4d-f714fab829e0")
        }
        update {
            param("AzAppId", "b9498375-0160-4831-8ce2-58f110a198ab")
        }
        expect {
            password("AzPassword", "credentialsJSON:b66a8739-aa0b-4987-a245-07c6907bdd01", label = "AzPassword")
        }
        update {
            password("AzPassword", "credentialsJSON:ee02187b-e094-48aa-aa01-a6d574d374b7", label = "AzPassword")
        }
        expect {
            param("OctoProject", "teamcity-dotnet-7-container-apps")
        }
        update {
            param("OctoProject", "onion-architecture-dotnet-7-container-apps")
        }
    }
}
