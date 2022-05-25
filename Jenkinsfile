#!groovy

pipeline {
    agent any

    tools {
        maven "3.8.5"
    }

    stages {
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
    }
}