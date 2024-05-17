pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                // Checkout the code from your version control system
                checkout scm
            }
        }

        stage('Build') {
            steps {
                ./gradle build
            }
        }

        stage('Test') {
            steps {
                ./gradle test
            }
        }

        stage('Deploy') {
            steps {
                // Run Gradle deploy task (replace 'deploy' with your actual deploy task)
                ./gradle deploy
            }
        }
    }

    post {
        success {
            // Send notification on success
            echo 'Build successful! Deployed successfully!'
        }

        failure {
            // Send notification on failure
            echo 'Build or deploy failed!'
        }
    }
}
