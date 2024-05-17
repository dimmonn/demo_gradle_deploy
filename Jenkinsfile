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
                sh -c 'gradle build'
            }
        }

        stage('Test') {
            steps {
                sh -c 'gradle test'
            }
        }

        stage('Deploy') {
            steps {
                // Run Gradle deploy task (replace 'deploy' with your actual deploy task)
                sh -c 'gradle deploy'
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
