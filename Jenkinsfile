
pipeline {
    agent any
    environment {
        ENV_NAME = 'STAG'
        LOGGLY_TAG = 'STAG'
    }
    stages {
        // stage('Clone') {
        //     steps {
        //         git branch: "${BRANCH_NAME}", credentialsId: 'Bitbucket', url: 'git@bitbucket.org:infracoreplatform/search-service.git'
        //     }
        // }
        // stage('Deploy') {
        //     steps {
        //         dir('search-service') {
        //             sh 'rake run_service'
        //         }
        //         echo 'Done'
        //     }
        // }
        stage('get_env') {
            steps {
                sh 'ps -aux'
            }
        }
    }
}
