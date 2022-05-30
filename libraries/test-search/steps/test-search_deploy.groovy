void call(){
    stage('print this env') {
            node {
                sh 'echo byeStarting'
            }
            node {
                sh 'echo byeeeEnding'
            }
        }
}
