pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'make'  // Exemple de commande shell
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'make test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'make deploy'
            }
        }
    }
}
