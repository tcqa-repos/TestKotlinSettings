import jetbrains.buildServer.configs.*

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
