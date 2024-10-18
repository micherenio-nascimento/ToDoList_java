pipeline {
    agent any

    environment {
       // DOCKER_HUB_CREDENTIALS = credentials('dockerhub-credentials') // Defina suas credenciais do Docker Hub
        DOCKER_IMAGE = 'nascimentomicherenio/todojava' // Nome da imagem Docker
       // KUBERNETES_CONTEXT = 'minikube' // Certifique-se de que o Minikube esteja rodando localmente
    }

    stages {

        stage('Docker Build') {
            steps {
                script {
                    // Faz o build da imagem Docker
                    docker.build("${DOCKER_IMAGE}:latest")
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
