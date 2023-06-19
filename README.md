# TraceMatcher

---
Java CLI tool to compute traces inclusion using biased traces between two Uppaal models.

## Prerequisites
- Uppaal 4.1
- Uppaal-Tron
- Java 11+
- Maven

Generate traces according to interesting portions ("bias") of Uppaal Timed Automata models.
## Installation
`mvn clean compile && mvn package`

## Usage
```
TraceMatcher [-hV] [-d=<dir>] --how=<strategy> --model=<model>
                    --mutant=<mutant>
  -d, --dir=<dir>         Working directory.
  -h, --help              Show this help message and exit.
      --how=<strategy>    How to generate traces, one of: random, biased.
      --model=<model>     Path to first model.
      --mutant=<mutant>   Path to second model.
  -V, --version           Print version information and exit.
```
### Examples
#### Basic usage (biased traces between two models)
`TraceMatcher --model=foo.xml --mutant=baz.xml`
#### Traces inclusion with random traces
`TraceMatcher --model=foo.xml --mutant=baz.xml --how=random`

## Author
* David Cortés