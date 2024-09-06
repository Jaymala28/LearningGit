pipeline {
    agent any

    stages {
        stage('Unit Test') {
            steps {
                echo 'Junit'
            }
        }
        stage('Static Analysis') {
            steps {
                echo 'Sonar Qube'
            }
        }
        stage('Maven Build') {
            steps {
                echo 'Generate build using Maven'
            }
        }
        stage('Execute Regression Suite') {
            steps {
                echo 'Execute regression suite using Selenium and Rest API'
            }
        }
    }
}
