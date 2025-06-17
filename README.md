<h1 align="center">
  #Maven Archetype API template
</h1>
<h3 align="center">
  #Maven archetype to generate an API with suppport for openapi/tracing/metrics/etc
</h3>
<br>

[![Released under the MIT license.](https://img.shields.io/badge/license-MIT-blue.svg)](./LICENSE)
[![All Contributors][all-contributors-badge]](#contributors)
[![PRs welcome!](https://img.shields.io/badge/PRs-welcome-brightgreen.svg)](./CONTRIBUTING.md)
[![Code of Conduct][coc-badge]][coc]

## Table of Contents

* [Table of Contents](#table-of-contents)
* [❗ Code of Conduct](#-code-of-conduct)
* [Project Structure](#project-structure)
* [🙌🏻 How to Contribute](#-how-to-contribute)
* [🛠️ How to Use](#️-how-to-use)
* [📝 License](#-license)
* [Contributors ✨](#contributors-)

## ❗ Code of Conduct

We expect everyone to abide by our [**Code of Conduct**](.github/CODE_OF_CONDUCT.md). Please read it. 🤝

## Project Structure

```sh
├── LICENSE
├── output.txt
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── resources
    │       ├── archetype-resources # Files that will be used to generate the new project
    │       │   ├── app
    │       │   │   ├── pom.xml
    │       │   │   └── src
    │       │   │       ├── main
    │       │   │       │   ├── java
    │       │   │       │   │   ├── App.java
    │       │   │       │   │   ├── auth
    │       │   │       │   │   │   └── SecurityConfiguration.java
    │       │   │       │   │   ├── exceptions
    │       │   │       │   │   │   └── NotReturnedException.java
    │       │   │       │   │   └── greeting
    │       │   │       │   │       ├── GreetingController.java
    │       │   │       │   │       └── GreetingService.java
    │       │   │       │   └── resources
    │       │   │       └── test
    │       │   │           └── java
    │       │   │               └── AppTest.java
    │       │   ├── pom.xml
    │       │   └── spec
    │       │       ├── openapi.yaml
    │       │       └── pom.xml
    │       └── META-INF
    │           └── maven
    │               └── archetype-metadata.xml #Define archetype properties and rules
    └── test
        └── resources
            └── projects
                └── hello
                    ├── archetype.properties
                    └── goal.txt
```

## 🙌🏻 How to Contribute

Check out our [**Contributing Guide**](.github/CONTRIBUTING.md) for information on contributing.

## 🛠️ How to Use

Before proceeding, ensure the following tools are installed and properly configured:

* [Git](https://git-scm.com/)
* [Maven](https://maven.apache.org/)
* [Java 17+](https://adoptopenjdk.net/)

Clone the repository and install the archetype to your local Maven repository:

```bash
git clone https://github.com/xgeekshq/xgeeks-maven-archetype-api
cd xgeeks-maven-archetype-api
mvn clean install
```

Once installed, navigate to the target directory and run the following command:

```bash
mvn archetype:generate -DarchetypeGroupId=com.xgeeks.template \
    -DarchetypeArtifactId=maven-archetype-api \
    -DgroupId=<GroupId> \
    -DartifactId=<ArtifactId> \
    -Dversion=<version> \
    <Additional parameters>
```

You can replace `<GroupId>`, `<ArtifactId>`, `<version>` and `<Additional parameters>` with your own values.
This template supports the following additional parameters:

| Parameter                 | Description                                      | Default Value |
| ------------------------- | ------------------------------------------------ | ------------- |
| `IncludeOpenAPIGenerator` | Enable support for code generation from an openapi spec file | `false`       |


## 📝 License

Licensed under the [MIT License](./LICENSE).

## Contributors ✨

Thanks goes to these wonderful people ([emoji key](https://allcontributors.org/docs/en/emoji-key)):
<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>

</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->

This project follows the [all-contributors](https://github.com/all-contributors/all-contributors) specification. Contributions of any kind welcome!

[all-contributors-badge]: https://img.shields.io/github/all-contributors/xgeekshq/oss-template?color=orange&style=flat-square
[coc]: .github/CODE_OF_CONDUCT.md
[coc-badge]: https://img.shields.io/badge/code%20of-conduct-ff69b4.svg?style=flat-square

------------------------------------------------------------------------------------------------------
<p align="center">
  <a align="center" href="https://www.xgeeks.com/">
    <img alt="xgeeks" src=".github/IMAGES/Synvert_xgeeks_main.svg" width="100">
  </a>
</p>
<h4 align="center">xgeeks Open Source</h4>
