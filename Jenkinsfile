pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/<Nallipogu-Swetha>/myapp-ci-cd.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
    }
}
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/<your-username>/myapp-ci-cd.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/<your-username>/myapp-ci-cd.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
stage('SAST Scan') {
    steps {
        sh 'sonar-scanner -Dsonar.projectKey=myapp -Dsonar.sources=src -Dsonar.host.url=http://localhost:9000 -Dsonar.login=<token>'
    }
}
stage('DAST Scan') {
    steps {
        sh 'zap-cli quick-scan --self-contained http://localhost:8080'
    }
}
