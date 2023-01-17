# mill-macro-workbench

A simple reproduction of `mill` not outputting macro `println` statements versus `sbt`.

## Reproduction Steps

### SBT Behavior

1. Run sbt sandbox/run (Observe macro output printed)
2. Run sbt clean
3. Run sbt sandbox/run (Observe macro output printed)

### Mill Behavior

1. Run ./mill sandbox.run (Observe macro output printed)
2. Run ./mill clean
3. Run ./mill sandbox.run (Observe no macro output)

Try the above cycle a few times with mill if the initial cycle does work it doesn't work the second time around.

