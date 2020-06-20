# Base2021

![gradle build](https://github.com/frc-862/Base2021/workflows/gradle%20build/badge.svg)

Base Project for 2021

## Getting Started

clone repo with SSH:

```bash
cd <repo-destination>
git clone --recurse-submodules git@github.com:frc-862/Base2021.git
```

clone repo with HTTPS:

```bash
cd <repo-destination>
git clone --recurse-submodules https://github.com/frc-862/Base2021.git
```

some git settings to make your life easier as this project uses submodules:

1. `git config --global diff.submodule log`
2. `git config --global status.submoduleSummary true`
3. `git config --global push.recurseSubmodules on-demand`
4. `git config --global submodule.recurse true`

[here](https://github.github.com/training-kit/downloads/submodule-vs-subtree-cheat-sheet/) is a helpful cheatsheet

[this](https://stackoverflow.com/questions/5542910/how-do-i-commit-changes-in-a-git-submodule) stack overflow post might help too
