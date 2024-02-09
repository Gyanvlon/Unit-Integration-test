pipeline {
    agent any
    environment {
        DOCKER_IMAGE = 'gyanvloon/unit-test:version1'
        port=8080
        containerName="unit-test-container"
    }
    stages {
        stage('Clone repository') {
            steps {
                git 'https://github.com/Gyanvlon/Unit-Integration-test.git'
            }
        }
        stage('Build and Test') {
            steps {
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                   dockerImage= docker.build DOCKER_IMAGE
                }
            }
        }
        stage('Uploading Docker Image') {
             steps {
                script {
                    docker.withRegistry('', 'docker_id') {
                        docker.image("${DOCKER_IMAGE}").push()
                    }
                }
            }
        }
        stage('Build Pull Image') {
            steps {
                script {
                    docker.image("${DOCKER_IMAGE}").pull()
                }
            }
        }
        stage('Deploy Docker Image') {
            steps {
                script {
                    docker.image("${DOCKER_IMAGE}").run("-p 8080:80 --name container -d")
                }
            }
        }
    }
}
