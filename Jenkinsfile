pipeline {
    agent any
    stages {
        stage('Clone stage') {
            steps {
                echo 'Hello Nguyen Manh Dung'
            }
        }
        stage('Tai Maven') {
            steps {
                echo 'Tai Maven ne'
                sh 'sudo apt install maven'
                sh 'mvn --version'
            }
        }
        stage('Build') {
            steps {
                echo 'Build ne'
                sh 'mvn clean install'
            }
        }
        stage('Run') {
            steps {
                echo 'Run ne'
                sh 'java -jar /var/jenkins_home/workspace/jenkins-helloworld/test/target/test-0.0.1-SNAPSHOT.jar'   
            }
        }
    // stage('Build image') {
    //     steps {
    //         withDockerRegistry(credentialsId: 'dockerhub-nmd', url: 'https://index.docker.io/v1/') {
    //             echo 'Bắt đầu tạo image'
    //             sh 'docker build -t nguyenmanhdung/jenkins-helloworl:0.0.1 .'
    //             echo 'Tạo image thành công'
    //             echo 'Bắt đầu push image'
    //             sh 'docker push nguyenmanhdung/jenkins-helloworl:0.0.1'
    //             echo 'Push image thành công'
    //         }
    //     }
    // }
    }
}
