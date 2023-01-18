# mill-macro-workbench

A simple reproduction of `mill` not outputting macro `println` statements versus `sbt`.

## Reproduction Steps

### SBT Behavior

1. Run sbt sandbox/run (Observe macro output printed)
2. Run sbt sandbox/clean
3. Run sbt sandbox/run (Observe macro output printed)

### Mill Behavior

1. Run ./mill sandbox.run (Observe macro output printed)
2. Run ./mill clean sandbox.compile
3. Run ./mill sandbox.run (Observe no macro output)

Try the above cycle a few times with mill if the initial cycle does work it doesn't work the second time around.

### Mill Behavior (with workaround)

1. Upgrade to `.mill-version` with a fix of the issue with cleaning sources (i.e. 0.10.10-5-e7ed05)
2. Run ./mill --no-server sandbox.run (Observe macro output printed)
3. Run ./mill --no-server clean sandbox.compile
4. Run ./mill --no-server sandbox.run (Observe macro output printed)
