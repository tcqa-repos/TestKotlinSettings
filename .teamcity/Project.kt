import jetbrains.buildServer.configs.kotlin.v2018_2.Project

object Project : Project({
    vcsRoot(TestVcsRoot)
})

object TestVcsRoot : GitVcsRoot({
    name = "Test Root"
    url = "https://github.com/tcqa-repos/TestKotlinSettings"
})
