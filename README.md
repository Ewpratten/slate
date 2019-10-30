# *SLATE* : Infiltration
A text-based adventure game by: [@exvacuum](https://github.com/exvacuum) and [@ewpratten](https://github.com/ewpratten)

## Objective
In _Slate_, you play as a disgruntled office drone at an advanced chemical research center. Fed up with the constant existential dread and stress of a full-time job, your objective is to infiltrate the lab and retireive _the artifact_, a suitably-named artifact of great scientific importance. Gaining possession of this object will make you rich overnight.

## Features
 - Rooms
   - May contain items
   - May contain containers
   - Contains doorways to other rooms
 - Containers
   - Inventories within rooms
   - May be either locked or unlocked
 - Inventories
   - Contains/can contain items
   - Player's "pockets"
   - Room root inventory (The floor)
   - Inventories within containers
 - Guard
   - Someone you don't want to see
   - Move between rooms
   - If you get caught, game over.
 - Item
   - Something you can pick up/use

## Software design

_Slate_ has many features, and much of the design process can be explored on the [wiki](https://github.com/Java-prog-class-2019/slate/wiki).

## Requirements
This program requires Java 11, and will fail without it. We recommend installing java 11 through [sdkman](https://sdkman.io/), as it simplifies the installation and linking process. With Java 11 installed, the following command must be run in the root of the project to init our libraries:
```sh
# Linux
./gradlew assemble

# Windows
.\gradlew.bat assemble
```

## Packaging and deployment
Application packaging is handled by [GNU Make](https://www.gnu.org/software/make/). For each release of Slate, the following artifacts are generated:
 - A cross-platform [FatJAR](https://stackoverflow.com/a/29925421)
 - A windows-only executable with portable JRE

To generate a package bundle, the following tools are needed:
 - ZIP
 - Make
 - Java 11
 - Gradle >=5.0

With these programs installed, run the following in the project root:
```sh
make package
```

The outputs will be generated in `./output/`. Each file should be added as a binary to the GitHub Release.