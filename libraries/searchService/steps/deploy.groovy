void call(){
    stage('Deploy') {
            node {
                sh 'echo helloStarting from searchService steps deploy'
            }
        }
}