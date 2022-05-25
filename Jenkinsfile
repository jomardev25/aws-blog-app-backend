#!groovy

pipeline {
    agent any

    tools {
        maven "3.8.5"
    }

    stages {
        stage("Build") {
            steps {
                bat "mvn -version"
                bat "mvn clean install"
            }
        }
        stage("Build Docker Image") {
            steps {
                bat "docker build -t jomardev25/blog-app ."
            }
        }
        stage("Run Docker Image") {
            steps {
                bat "docker run -d -p 8090:8090 jomardev25/blog-app"
            }
        }
    }
}