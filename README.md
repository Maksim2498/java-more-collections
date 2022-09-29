# More Collections

![Logo](/images/logo.png)

## Index

- [Index](#index);
- [About](#about);
- [Installation](#installation);
- [Building](#building);
- [Documentation](#documentation).

## About

This library provides more collections to standard library.
New collections and their status is shown in the table below:

| Collection          | Description                        | Status      |
|---------------------|------------------------------------|-------------|
| Live sub-collection | Live refleciton of collection part | Implemented |
| Live sub-set        | Live reflection of set part        | Implemented |
| Live sub-list       | Live reflection of list part       | In progress |
| Live sub-map        | Live reflection of map part        | Planned     |
| Class map           | Map with class as key type         | Planned     |

## Installation

First, add MoonTalk repository to your pom.xml:

```xml
<repository>
    <id>moontalk</id>
    <url>httsp://repo.moontalk.space/repository/maven-releases/</url>
</repository>
```

Second, add library as dependency:

```xml
<dependency>
    <groupId>space.moontalk.more</groupId>
    <artifactId>collections</artifactId>
    <version>1.0.0</version>
</dependency>
```

Done.

## Building

Just execute the following Maven command in your terminal:

```bash
mvn install
```

## Documentation

Will be added soon...
