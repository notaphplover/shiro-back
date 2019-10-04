# Description

Simple dockerized test project with a simple continuous integration system.

# How to build the project

1. Clone the repo.
2. Build gradle dependencies

```
    gradle build
```

# How to launch tests

Just call the gradle test task:
```
    gradle test
```

# How to generate a code coverage report

After calling the test task, run the jacocoTestReport task.

```
    gradle jacocoTestReport
```
