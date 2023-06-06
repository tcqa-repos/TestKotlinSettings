import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object MyProject : Project({
    vcsRoot(TestVcsRoot)
    buildType(Build)
    name = "My Project"
})

object Build : BuildType({
    name = "Build"
})

object TestVcsRoot : GitVcsRoot({
    name = "Test Root"
    url = "https://github.com/tcqa-repos/TestKotlinSettings"
})
