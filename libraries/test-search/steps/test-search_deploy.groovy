void call() {
    stage('get_env') {
        node {
            sh 'echo this is test-search'
        }
    }
}