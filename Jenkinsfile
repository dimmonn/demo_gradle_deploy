pipeline {
    agent any

    stages {

        stage('Clean') {
            steps {
                // Checkout the code from your version control system
                sh './gradlew stop'
            }
        }

        stage('Checkout') {
            steps {
                // Checkout the code from your version control system
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Run Gradle build
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                // Run Gradle tests
                sh './gradlew test'
            }
        }

        stage('Deploy') {
            steps {
                // Run Gradle deploy task (replace 'deploy' with your actual deploy task)
                sh './gradlew deploy'
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
