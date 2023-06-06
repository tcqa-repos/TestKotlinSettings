import jetbrains.buildServer.configs.kotlin.Project
import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object Project : Project({
    vcsRoot(TestVcsRoot)
    buildType(Build)
})

object Build : BuildType({
    name = "Build"
})

object TestVcsRoot : GitVcsRoot({
    id("TestRoot")
    name = "Test Root"
    url = "https://github.com/tcqa-repos/TestKotlinSettings"
    branch = "main"
})
