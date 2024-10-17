pipeline {
    agent any

    stages {
        
        stage('Docker Build') {
            steps {
                script {
                    dockerapp = docker.build("nascimentomicherenio/todojava:${env.BUILD_ID}",
                        '-f ./Dockerfile')
                }
            }
        }
        
        stage('Docker Push Image') {
            steps {
                script {
                        docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
                        dockerapp.push('latest')
                        dockerapp.push("${env.BUILD_ID}")
                    }
                }
            }
        }
        
    }
}