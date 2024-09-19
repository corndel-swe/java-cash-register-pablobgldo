# Cash register

<p align="center">
  <img src="./assets/cr-logo.png" width="200px">
</p>

Welcome to the cash register! This is a library of functions to be used in
point-of-sale systems around the country.

## Getting started

1. Make sure your machine is set up according to the instructions with

   - [bash](https://tech-docs.corndel.com/bash/)
   - [vscode](https://tech-docs.corndel.com/vscode/)
   - [git](https://tech-docs.corndel.com/git/)
   - [java and maven](https://tech-docs.corndel.com/java/installation.html)

1. Clone the repository (i.e. download it), so you have a copy on your machine:

   ```bash
   git clone <your-repository-url>
   ```

1. Once cloned, open a terminal in the project folder, and run

   ```bash
   ./mvnw clean compile
   ```

   to install dependencies.

## Running tests

To check if your solution for one of the exercises has worked, you can run the
tests.

You can choose from either method below:

### Option 1: Using VS Code

You can open up the "Testing" tab and press play on the test or group of tests
you want to run.

<p align="center">
  <img src="assets/image.png" width="250px"></img>
</p>

### Option 2: Using the CLI

To check if your solution for one of the exercises has worked, you can run the
command

```bash
./mvnw test
```

in the terminal.

> [!TIP]
>
> You can choose which test to run using the `-Dtest=` parameter. E.g. Runnning
>
> ```bash
> ./mvnw test -Dtest=Exercise1aTest
> ```
>
> in the terminal will test only the `Exercise1a.java` code using the
> `Exercise1aTest.java` test file.

## Deep dive

Before working on Cash Register, there are a few things we need to learn. There
are some documentation pages which will teach you what you need to know, and
some exercises for you to practice your skills.

```mermaid
flowchart TD
    A[Read doc page]
    B[Attempt exercises]
    C[Run tests]
    D[Commit & push]

    A --> B
    B --> C
    C --> D
    D --> A
```

### Object basics

1. Read the docs on
   [object basics](https://tech-docs.corndel.com/java/object-basics.html) and
   [classes and instances](https://tech-docs.corndel.com/java/classes-and-instances.html).

1. Complete Exercise 1a:

   - Run the tests to see if you got it right.

   - Once you pass the tests, type `git commit -am "Solves 1a"` in the terminal
     and hit enter to commit your solution.

   - Now run `git push` to sync your changes to github.

1. Solve, commit and push Exercise 1b.

### Lists of objects

1. Read the docs on
   [lists of objects](https://tech-docs.corndel.com/java/lists-of-objects.html).

1. Solve, commit and push Exercise 2a.

1. Solve, commit and push Exercise 2b.

### Object challenges

1. Solve, commit and push Exercise 3a.

1. Solve, commit and push Exercise 3b.

## Moving on

Great job! With the deep dive taken care of, we're ready to build our PoS system
(that's _Point of Sale_ :wink:).

Find `CONTRIBUTING.md` to find out what to do.
