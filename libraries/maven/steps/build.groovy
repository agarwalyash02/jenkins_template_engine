void call(){
    stage('print using echo') {
        node {
            if (config.envName == "dev"){
                sh 'echo this block extra'
            }
            sh 'echo helloStarting'
            println config.envName
        }
        node {
            sh 'echo heyEnding'
        }
    }
}
