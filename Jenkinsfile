pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Executa o Maven para compilar o projeto
                sh 'mvn clean install'
            }
        }
    }
}