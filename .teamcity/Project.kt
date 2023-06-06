import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.vcs.GitVcsRoot

object MyProject : Project({
    id("TestSettings")
    vcsRoot(TestVcsRoot)
    buildType(Build)
})

object Build : BuildType({
    name = "Build"
})

object TestVcsRoot : GitVcsRoot({
    name = "Test Root"
    url = "https://github.com/tcqa-repos/TestKotlinSettings"
})
