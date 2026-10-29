#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$ROOT_DIR"

rm -rf bin
mkdir -p bin

find src -name '*.java' -print0 | xargs -0 javac -d bin

echo "Build complete: $(find bin -name '*.class' | wc -l | tr -d ' ') classes in bin/"
