# Dark Matter color scheme

## Setup

- IntelliJ > New Project > IDE Plugin
- Add MIT LICENSE
- Setup signing and
  publishing ([guide](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html#signing-methods))
    - Place key files in `certificate/` and configure then source `.env`
    - Build, sign, and publish with `./gradlew publishPlugin`
- Follow [theme guide](https://plugins.jetbrains.com/docs/intellij/themes-extras.html#adding-a-custom-editor-scheme)
  - Export color scheme to `Dark_Matter.icls`, rename extension to `.xml`, and move to `src/main/resources/`

## TODO

- `wrapper` task with configurable version and distribution type (`if $CI ? "BIN" : "ALL"`)
