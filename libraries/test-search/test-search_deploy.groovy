void call() {
    stage('get_env') {
            steps {
                sh 'echo hello'
                // sh 'printenv'
                // echo $ENV_NAME
            }
        }
}