@Library("sample-jenkins-shared-lib")_

pipeline{
    agent any
    stages{
        stage("Deploy"){
            deployApp(
                appName: "java-Node-FSD-APP",
                port:5000,
                environment: "PRODUCTION"
            )
        }
    }
}