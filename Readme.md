# Using sbt 

Simple Build Tool (i.e., sbt) is a general purpose build tool written in Scala for JVM developers. It has the following awesome features:

- Built-in tasks
- Plugin architecture
- Declarative Dependency management
- Code over Configuration: A DSL for build tool
- Interactive nature: It isn't just a build tool, it also provides an interactive environment to work in.
- Scala REPL integration

sbt can be used in two modes: command-line mode and interactive mode. 
- `command-line mode`, you run sbt task from your terminal. Once the task successfully finishes then sbt exits. 
- `interactive mode`, you run sbt command and it launches a sbt shell. Inside the sbt shell session, you run sbt tasks.

- ### Installing sbt
If you are on mac then, you can use package manager like brew to install sbt: Example: `$brew install sbt`. Other systems use tutorial here (`http://www.scala-sbt.org/1.x/docs/Setup.html`) to install sbt.


## Create a sbt Scala project

Once you have successfully installed sbt on your machine, go ahead and clone the project
```
|-- build.sbt
|-- lib
|-- project
|   |-- build.properties
|   |-- plugins.sbt
|-- src
|   |-- main
|   |   |-- java (store main java files)
|   |   |-- resources (store include in main jar)
|   |   |-- scala (store main Scala source files)
|   |-- test
|       |-- java (store test java files)
|       |-- resources (store files include in test jar)
|       |-- scala (store test scala source files)
|-- target
```
  ## Plugins
  
Let’s examine now how SBT can be extended using plugins.
Plugins are extension of SBT. Plugins exploits the power and flexibility of SBT. Lets add a eclipse related plugin in `project/plugins.sbt`

`addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")`

sbt-eclipse plugin makes available a command to generate eclipse configurations for an sbt project. Now you have a new eclipse command. 

recommended also edit: `project/build.properties`. Add the following line in the `build.properties`

`sbt.version=1.0.4`

When you add plugins, they often depends on the version of sbt. So it is recommended you also specify the version of the SBT you are using.

Our build.sbt looks like this:
```
name := "sbs-example"
version := "1.0"
scalaVersion := "2.12.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
resolvers += Resolver.mavenLocal

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"

fork in run := true
```
## Running the code

- ### Run from eclipse
  - Step 1: Run `sbt eclipse` and then import in eclipse as project 
  - Step 2: Right click `PizzaDemo.scala` and Run As `Scala Application`
- ### Run from command-line
  - Step 1: To Compile using command-line use  `sbt compile` and `sbt test` to run all the unit tests
  - Step 2: Package jar using `sbt package` 
  - Step 3: Run using `scala target/scala-2.12/sbs-example_2.12-1.0.jar`


