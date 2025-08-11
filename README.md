# CS450 UMass Boston – Operating Systems

Welcome to the CS450 Operating Systems repository for UMass Boston! This repository contains coursework, projects, assignments, and resources related to the CS450 course.

---

## Table of Contents

1. [About the Course](#about-the-course)
2. [Repository Structure](#repository-structure)
3. [Getting Started](#getting-started)
4. [Example Projects](#example-projects)
5. [Assignment Submission Guide](#assignment-submission-guide)
6. [Contribution Guidelines](#contribution-guidelines)
7. [Resources](#resources)
8. [License](#license)
9. [Frequently Asked Questions](#frequently-asked-questions)
10. [Instructor & Contact](#instructor--contact)

---

## About the Course

**CS450: Operating Systems** is a senior-level Computer Science course at the University of Massachusetts Boston.  
The course covers the fundamentals and advanced concepts of operating systems, including:
- Process management
- Scheduling algorithms
- Memory management
- Virtual memory
- File systems
- System calls
- Deadlocks
- Synchronization and concurrency

### Learning Outcomes

By the end of the course, students will be able to:
- Understand the core components and workings of modern operating systems
- Analyze and implement process, memory, and file management
- Write and debug system-level code in C and other programming languages
- Develop, document, and test OS-related projects

---

## Repository Structure

The repository is organized as follows:

```
.
├── assignments/        # Homework assignments and solutions
├── projects/           # Major course projects
├── labs/               # Lab exercises and code samples
├── notes/              # Lecture notes and study materials
├── examples/           # Example code and reference implementations
├── scripts/            # Useful scripts for development and testing
├── tests/              # Test cases and test scripts
├── README.md           # This file
└── LICENSE             # Repository license
```

- **assignments/**: Contains HWs and problem sets with solutions or starter code.
- **projects/**: Complete project codebases (e.g., shell, file system, scheduler).
- **labs/**: Smaller exercises to reinforce key concepts.
- **notes/**: PDF or Markdown notes from lectures or recitations.
- **examples/**: Sample code for quick reference.
- **scripts/**: Automation, build, or testing scripts.
- **tests/**: Automated tests for assignments/projects.

---

## Getting Started

### Prerequisites

- **C/C++ Compiler** (e.g., gcc, clang)
- **Make** (for building projects)
- **Git** (for version control)
- **Python** (for some scripts or testing)
- Optional: Docker (for consistent build environments)

### Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Abdiabera/Cs450Umass.git
   cd Cs450Umass
   ```

2. **Install dependencies:**
   - For Ubuntu/Debian:
     ```bash
     sudo apt-get update
     sudo apt-get install build-essential gcc g++ make python3
     ```
   - For Mac:
     ```bash
     brew install gcc make python3
     ```

3. **Build a sample project:**
   ```bash
   cd projects/simple-shell
   make
   ./shell
   ```

---

## Example Projects

### 1. Simple Shell

A basic command-line shell implemented in C, supporting built-in commands, process management, and piping.

- **Location:** `projects/simple-shell/`
- **Features:**
  - Command parsing
  - Background execution (&)
  - Input/output redirection
  - Piping

### 2. Memory Allocator

Implements a simple user-space memory allocator (malloc/free) for understanding heap memory management.

- **Location:** `projects/memory-allocator/`
- **Features:**
  - Block splitting and merging
  - Free list management
  - Memory usage statistics

### 3. Thread Scheduler

A cooperative thread scheduler simulating context switch, scheduling algorithms (RR, FCFS).

- **Location:** `projects/scheduler/`
- **Features:**
  - Thread creation and switching
  - Multiple scheduling algorithms
  - Synchronization primitives

---

## Assignment Submission Guide

1. **Complete the assignment in the respective folder (e.g., `assignments/hw1/`).**
2. **Test your code using provided test scripts or your own.**
3. **Commit your changes:**
   ```bash
   git add assignments/hw1/
   git commit -m "Completed HW1 - Process Synchronization"
   git push origin main
   ```
4. **Create a pull request if collaborating or for instructor review.**
5. **Follow any additional submission instructions provided in the assignment README.**

---

## Contribution Guidelines

We welcome collaboration! Please follow these guidelines:

- **Fork the repo** and create a feature branch
- **Write clear commit messages**
- **Document your code** (useful comments, README updates)
- **Test thoroughly** before submitting a PR
- **Open issues** for bugs or feature suggestions

**Example workflow:**
```bash
git checkout -b feature/my-cool-feature
# Make your changes
git commit -am "Add a cool feature"
git push origin feature/my-cool-feature
# Open a PR on GitHub
```

---

## Resources

- [CS450 UMass Boston Syllabus](https://cs.umb.edu/~smaurer/courses/cs450/syllabus.html)
- [Operating System Concepts, Silberschatz et al.](https://os-book.com/)
- [Linux System Programming, Love](https://nostarch.com/linuxsystemprogramming2)
- [GDB Debugger](https://www.gnu.org/software/gdb/)
- [Valgrind Memory Debugger](http://valgrind.org/)
- [Linux Kernel Documentation](https://www.kernel.org/doc/html/latest/)
- [C Programming Reference](https://devdocs.io/c/)
