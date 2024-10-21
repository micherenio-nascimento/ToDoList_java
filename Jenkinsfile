pipeline {
    agent any

    environment {
        DOCKER_HUB_CREDENTIALS = credentials('dockerhub-credentials')
    }

    stages {
        stage('Maven Build') {
            steps {
                script {
                    sh 'mvn clean package'
                }
            }
        }

        stage('Docker Build') {
            steps {
                script {
                    sh 'docker build -t nascimentomicherenio/tomcat-jenkins-todolistjava:1.1 .'
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
                    sh 'docker push nascimentomicherenio/tomcat-jenkins-todolistjava:1.1'
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
