pipeline {
    agent any 
    stages {


        stage('') { 
            steps {
                sh 'mvn clean 'c
            }
        }
       stage('v') { 
            steps {
                sh 'mvn validate'
            }
        }
        stage('Co') { 
            steps {
                sh 'mvn compile'
            }
        }
        stage('Tc') { 
            steps {
                sh 'mvn test-compile'
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test'
            }
        }stage('pack') { 
            steps {
                sh 'mvn package'
            }
        }
        stage('install') { 
            steps {
                sh 'mvn install'
            }
        }  
    }
}
