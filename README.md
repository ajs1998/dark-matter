# Dark Matter

The default "Dark" color scheme was a little disappointing.

There's not enough color and too many tokens are white.
This is my take on a dark color scheme.

| Islands Dark                                                           | Dark Matter                                                          |
|------------------------------------------------------------------------|----------------------------------------------------------------------|
| ![Islands Dark.png](src/main/resources/screenshots/Islands%20Dark.png) | ![Dark Matter.png](src/main/resources/screenshots/Dark%20Matter.png) |

# Contributing

## Version bumps

In `build.gradle.kts` change `tasks.patchPluginXml.untilBuild`
to the latest branch number defined in this table:
https://plugins.jetbrains.com/docs/intellij/build-number-ranges.html#platformVersions

To make sure it works, run the `buildPlugin` task
and load the plugin from disk at `build/distributions/dark-matter.zip`

Push the change to
https://github.com/ajs1998/dark-matter
and create a GitHub release with the updated Dark Matter version tag, e.g. `v1.9`.
A GitHub action will build and publish the plugin to
https://plugins.jetbrains.com/plugin/22804-dark-matter
