pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/tandukarunique/Forjenkins1.git'
            }
        }
        
        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
    
    post {
        success {
            echo 'Tests passed! Build succeeded!'
        }
        failure {
            echo 'Tests failed! Please check the logs.'
        }
    }
}