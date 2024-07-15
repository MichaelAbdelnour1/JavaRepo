Here’s a comprehensive Git guide formatted for beginners, ready for uploading to your GitHub repository:

---

# Git Guide for Beginners

## Table of Contents
1. [Introduction](#introduction)
2. [Basic Commands](#basic-commands)
3. [Branching](#branching)
4. [Committing Changes](#committing-changes)
5. [Updating GitHub](#updating-github)
6. [Handling Commits](#handling-commits)
7. [Managing Remotes](#managing-remotes)
8. [Viewing Changes](#viewing-changes)

## Introduction
Git is a version control system that helps you manage changes to your code. This guide provides essential commands and workflows to help you get started.

## Basic Commands

### Creating a New Repository
```sh
git init
```

### Cloning a Repository
```sh
git clone <repository-url>
```

## Branching

### Creating a New Branch
```sh
git branch <branch-name>
```

### Switching Branches
```sh
git checkout <branch-name>
```

### Pushing a Specific Branch to GitHub
```sh
git push -u origin <branch-name>
```

### Pushing All Branches
```sh
git push --all origin
```

## Committing Changes

### Staging Changes
```sh
git add .
```
*To stage specific files, use:*
```sh
git add <file1> <file2>
```

### Committing Changes
```sh
git commit -m "Your commit message"
```

## Updating GitHub

### Pulling Changes from Remote
```sh
git pull origin <branch-name>
```

### Pushing Changes After Modifications
```sh
git push origin <branch-name>
```

## Handling Commits

### Resetting the Last Commit
```sh
git reset HEAD~1
```
*This keeps your changes in the working directory.*

### Cherry-Picking a Commit
1. Get the commit hash:
   ```sh
   git log
   ```
2. Cherry-pick the commit:
   ```sh
   git cherry-pick <commit-hash>
   ```

## Managing Remotes

### Adding a Remote Repository
```sh
git remote add origin <repository-url>
```

### Viewing Remote Repositories
```sh
git remote -v
```

### Removing a Remote
```sh
git remote remove <remote-name>
```

## Viewing Changes

### Checking Status
```sh
git status
```

### Viewing Commit History
```sh
git log
```

### Viewing Differences
To see what changes are staged:
```sh
git diff --cached
```
To see all changes (staged and unstaged):
```sh
git diff
```

---

