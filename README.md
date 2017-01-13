Prequisites
-----------
1. You will need JDK 8 for your platform. OpenJDK is preferred.
2. Install Scala 2.11.x : http://downloads.lightbend.com/scala/2.11.8/scala-2.11.8.tgz
3. Install SBT 0.13.8 : https://dl.bintray.com/sbt/native-packages/sbt/0.13.8/sbt-0.13.8.tgz

Configuring IDE
---------------
Intellij IDEA is the preferred IDE, although support for Eclipse will eventually be provided. 
1. Download IntelliJ community version here: https://www.jetbrains.com/idea/
2. When installing IntelliJ, make sure to check off the options to install Scala and SBT tools
3. Import the Scala code formatting settings: File -> Import Settings -> $PROJECT_ROOT_FOLDER/ide/settings.jar

Getting the code
----------------
1. You must install Git for your platform.
2. From GitHub, create a fork of this repository: https://github.com/AddictiveScience/Node-Graph-Database-Timeline
3. Clone your fork: "git clone https://github.com/$YOUR_GITHUB_USERNAME/Node-Graph-Database-Timeline timeline"
4. Choose Start -> New Project -> SBT -> Choose the root folder for the Timeline project

Development Lifecycle
---------------------
1. Create a feature branch in your fork
    ```bash
    git checkout -b my-feature
    ```
2. Develop your feature, you can commit as many times as you want into your local branch.
3. Make sure your branch is up to date with master
    ```bash
    # from your feature branch
    git checkout master
    git pull origin master
    git checkout my-feature
    git merge master
    ```
4. Run the full build lifecycle to ensure nothing is broken. Run any manual verifications you need to.
5. Do a squashed merge into master (NOTE - Do not develop features and make spurious commits into master. All work should be done in a feature branch and then squashed into one commit on master)*[]: 
    ```bash
    git checkout master
    git merge --squash my-feature
    git commit -m "$YOUR_NAME - adding support for my feature"
    git push origin master
    ```
6. Open a pull request against https://github.com/AddictiveScience/Node-Graph-Database-Timeline on GitHub

Building and Running
--------------------
* Compile the code
    ```bash
    sbt clean compile
    ```
* Run Tests
    ```bash
    sbt test
    ```
* Package the code
    ```bash
    sbt package
    ```
* Build a runnable JAR
    ```bash
    sbt package assembly
    ```
* Full build lifecylce
    ```bash
    sbt clean compile test package assembly
    ```
* Run the services project
    ```
    sbt "project services" "run"
    ```