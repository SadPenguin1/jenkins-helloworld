pipeline {
    agent any
    stages {
        stage('Clone stage') {
            steps {
                echo 'Hello Nguyen Manh Dung'
            }
        }
        stage('Build image') {
            steps {
                withDockerRegistry(credentialsId: 'dockerhub-nmd', url: 'https://index.docker.io/v1/') {
                    sh 'docker build -t nguyenmanhdung/jenkins-helloworl:0.0.1 .'
                    sh 'docker build -t nguyenmanhdung/jenkins-helloworl:0.0.1 '
                }
            }
        }
    }
}
