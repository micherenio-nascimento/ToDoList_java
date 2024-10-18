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

        stage('Login'){
            steps {
                script {
                    sh 'echo $DOCKER_HUB_CREDENTIALS_PSW | docker login -u $DOCKER_HUB_CREDENTIALS_USR --password-stdin'
                }
            }
        }

        // stage('Docker Push') {
        //     steps {
        //         script {
        //             docker.withRegistry('https://index.docker.io/v1/', 'DOCKER_HUB_CREDENTIALS') {
        //                 // Push da imagem para o Docker Hub
        //                 docker.image("${DOCKER_IMAGE}:latest").push()
        //             }
        //         }
        //     }
        // }

        // stage('Deploy to Kubernetes') {
        //     steps {
        //         script {
        //             // Configura o kubectl com o contexto do Minikube
        //             sh 'kubectl config use-context ${KUBERNETES_CONTEXT}'

        //             // Atualiza o deployment no Minikube
        //             sh """
        //                 kubectl set image deployment/nome-do-deployment \
        //                 nome-do-container=${DOCKER_IMAGE}:latest
        //             """
        //         }
        //     }
        // }
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
