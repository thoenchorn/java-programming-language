#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
cd "$ROOT_DIR"

if [[ $# -lt 1 ]]; then
    echo "Usage: $0 <fully.qualified.ClassName> [args...]"
    echo "Example: $0 fundamentals.HelloWorld"
    exit 1
fi

if [[ ! -d bin ]]; then
    ./scripts/build.sh
fi

java -cp bin "$@"
