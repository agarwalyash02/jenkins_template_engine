void call(){
    if (config.envName == "dev"){
        stage('print using echo') {
            node {
                
                sh 'echo helloStarting'
                println config.envName
            }
            node {
                sh 'echo heyEnding'
            }
        }
    }
    stage('print env') {
            node {
                sh 'echo byeStarting'
                println config.envName
            }
            node {
                sh 'echo byeeeEnding'
            }
        }
}
