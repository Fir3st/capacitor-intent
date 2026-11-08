# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [1.0.0] - 2026-11-08

### Added

- Support for Capacitor 8.

### Changed

- `@capacitor/core` peer dependency is now `>=8.0.0`; Capacitor 3 and 4 are no longer supported.
- Android build updated to AGP 8.13.0, Gradle 8.14.3, compile/target SDK 36, min SDK 24 and Java 21.
- Plugin now uses `PluginCall.resolve()` / `PluginCall.reject()` and launches intents with `getActivity().startActivity()`.
- Build tooling updated to TypeScript 5.9, Rollup 4, ESLint 10 (flat config) and Prettier 3.

### Removed

- Deprecated `jcenter()` repository.
- Unused SwiftLint configuration (the plugin has no iOS platform).

## [0.0.2] - 2023-04-22

### Changed

- Added Capacitor 4 to `peerDependencies`.

## [0.0.1] - 2022-01-19

### Added

- Initial release with `startActivity()` for executing Android intents.
