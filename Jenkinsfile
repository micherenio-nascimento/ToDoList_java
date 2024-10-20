pipeline {
    agent any

    environment {
        DOCKER_HUB_CREDENTIALS = credentials('dockerhub-credentials')
    }

    stages {
        stage('Docker Build') {
            steps {
                script {
                    sh 'docker build -t nascimentomicherenio/todojava:latest .'
                }
            }
        }

        stage('Login') {
            steps {
                script {
                    sh 'echo $DOCKER_HUB_CREDENTIALS_PSW | docker login -u $DOCKER_HUB_CREDENTIALS_USR --password-stdin'
                }
            }
        }

        stage('Docker Push') {
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
