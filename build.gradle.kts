plugins {
    id("org.jetbrains.intellij") version "1.17.2"
}

group = "dev.alexjs"

repositories {
    mavenCentral()
}

// Configure Gradle IntelliJ Plugin
// Read more: https://plugins.jetbrains.com/docs/intellij/tools-gradle-intellij-plugin.html
intellij {
    version.set("2023.2.4")
    plugins.set(listOf(/* Plugin Dependencies */))
}

tasks {
    // https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#platformVersions
    patchPluginXml {
        sinceBuild.set("222")
        untilBuild.set("242.*")
    }

    signPlugin {
        certificateChain.set(System.getenv("CERTIFICATE_CHAIN"))
        privateKey.set(System.getenv("PRIVATE_KEY"))
        password.set(System.getenv("PRIVATE_KEY_PASSWORD"))
    }

    publishPlugin {
        token.set(System.getenv("PUBLISH_TOKEN"))
    }

    wrapper {
        gradleVersion = "8.6"
        distributionType = Wrapper.DistributionType.ALL
    }
}
