#!groovy

pipeline {
    agent any

    tools {
        maven "3.8.5"
        docker "20.10.13"
    }

    stages {
        stage("Build") {
            steps {
                sh "mvn -version"
                sh "mvn clean install"
            }
        }
        stage("Build Docker Image") {
            steps {
            	sh "docker -v"
                sh "docker build -t jomardev25/springboot-blog-application ."
            }
        }
        stage("Run Docker Image") {
            steps {
                sh "docker run -d -p 8090:8090 jomardev25/springboot-blog-application"
            }
        }
    }
}