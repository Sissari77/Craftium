# Contributing to Craftium

Craftium is a vibe-coded, open-source competitor to Axiom. AI assistance is part of its development history. Contributions should be readable, independently implemented and checked against the actual Minecraft build.

## Build

Use Java 25 and the checked-in Gradle wrapper. The project targets Minecraft Java 26.2.

```sh
./gradlew build :server-plugin:build compileGametestJava
```

On Windows, use `gradlew.bat`. Fabric mod JARs are written to `build/libs/`; Paper/Purpur companion JARs are written to `server-plugin/build/libs/`. Use the same version on the client and server.

## Verify changes

The build runs the core and companion JUnit tests. Changes to world edits should preserve permissions, protection checks, block-entity data, history and operation limits.

The Minecraft integration scenario creates a disposable Creative world and opens a real game window:

```sh
./gradlew runClientGameTest
```

Set `CRAFTIUM_TEST_SCOPE` to `keybinds`, `builder`, `gizmos` or `gallery` for a focused scenario. Leave it unset for the full Fabric regression. The Paper/Purpur scenario needs separate local server fixtures; it is not part of the ordinary build. See [validation](docs/VALIDATION.md).

## Submit a change

- Explain the problem and resulting behavior in your pull request.
- Include relevant validation and actual screenshots for UI changes.
- Update the feature coverage and control guide when behavior changes.
- Cite official documentation when comparing Axiom behavior. Use original code and assets, and preserve third-party license notices.

AI-generated contributions are welcome when the contributor reviews and verifies them. Describe remaining limitations candidly; matching a workflow does not establish complete Axiom parity.
