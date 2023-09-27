# Dark Matter color scheme

## Setup

- IntelliJ > New Project > IDE Plugin
- Add MIT LICENSE
- Export color scheme to `Dark_Matter.icls` and move to `src/main/resources/`
- Setup signing & publish Keys ([guide](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html#signing-methods))
  - Configure `.env` and place key files in `certificate/`

## TODO

- `wrapper` task with configurable version and distribution type (`if $CI ? "BIN" : "ALL"`)
