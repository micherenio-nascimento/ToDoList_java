pipeline {
    agent any

    environment {
        DOCKER_HUB_CREDENTIALS = credentials('dockerhub-credentials')
    }

    stages {
        stage('Docker Build Todo') {
            steps {
                script {
                    sh 'docker build -t nascimentomicherenio/todojava:latest .'
                }
            }
        }

        stage('Docker Build Tomcat') {
            steps {
                script {
                    sh 'docker build -t tomcat-jenkins .'
                }
            }
        }

        stage('Run Tomcat Container') {
            steps {
                script {
                    sh 'docker run -d -p 8080:8080 --name tomcat-jenkins --privileged -v /var/run/docker.sock:/var/run/docker.sock tomcat-jenkins'
                }
            }
        }
        
        stage('Login to Docker Hub') {
            steps {
                script {
                    sh 'echo $DOCKER_HUB_CREDENTIALS_PSW | docker login -u $DOCKER_HUB_CREDENTIALS_USR --password-stdin'
                }
            }
        }

        stage('Docker Push Todo') {
            steps {
                script {
                    sh 'docker push nascimentomicherenio/todojava:latest'
                }
            }
        }

    }

    post {
        success {
            echo 'Pipeline executado com sucesso!'
        }
        failure {
            echo 'Pipeline falhou!'
        }
    }
}
