void call() {
    stage('get_env') {
        steps {
            sh 'echo hello'
        }
    }
}