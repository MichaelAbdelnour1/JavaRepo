Sure! Here’s a beginner-friendly guide based on basic Linux commands inspired by the GeeksforGeeks article:

---

# Basic Linux Commands Guide

## Table of Contents
1. [Introduction](#introduction)
2. [File and Directory Management](#file-and-directory-management)
3. [Viewing and Manipulating Files](#viewing-and-manipulating-files)
4. [File Permissions](#file-permissions)
5. [System Information](#system-information)
6. [Networking Commands](#networking-commands)

## Introduction
Linux is a powerful operating system used widely in servers and development environments. This guide covers essential commands for beginners to navigate and manage files in a Linux environment.

## File and Directory Management

### Listing Files and Directories
```sh
ls
```
*Options:*
- `ls -l`: Detailed list format
- `ls -a`: Show all files, including hidden files

### Changing Directory
```sh
cd <directory>
```
*Example:*
```sh
cd /home/user/Documents
```

### Creating a Directory
```sh
mkdir <directory-name>
```

### Removing a Directory
```sh
rmdir <directory-name>
```
*To remove a directory with files:*
```sh
rm -r <directory-name>
```

### Copying Files
```sh
cp <source> <destination>
```

### Moving/Renaming Files
```sh
mv <source> <destination>
```

### Deleting Files
```sh
rm <file-name>
```

## Viewing and Manipulating Files

### Viewing File Contents
```sh
cat <file-name>
```

### Viewing File Contents Page by Page
```sh
less <file-name>
```

### Displaying the First Few Lines of a File
```sh
head <file-name>
```

### Displaying the Last Few Lines of a File
```sh
tail <file-name>
```

## File Permissions

### Viewing File Permissions
```sh
ls -l
```

### Changing File Permissions
```sh
chmod <permissions> <file-name>
```
*Example:*
```sh
chmod 755 script.sh
```

### Changing File Ownership
```sh
chown <user>:<group> <file-name>
```

## System Information

### Displaying Current Directory
```sh
pwd
```

### Checking System Information
```sh
uname -a
```

### Checking Disk Usage
```sh
df -h
```

### Checking Memory Usage
```sh
free -h
```

## Networking Commands

### Checking Network Connections
```sh
netstat -tuln
```

### Checking IP Address
```sh
ifconfig
```
*or*
```sh
ip addr show
```

### Testing Connectivity
```sh
ping <hostname>
```

---
